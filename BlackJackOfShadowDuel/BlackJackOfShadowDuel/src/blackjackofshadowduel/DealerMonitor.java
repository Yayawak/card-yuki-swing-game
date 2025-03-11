/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel;
import java.lang.Thread;
import blackjackofshadowduel.*;
import blackjackofshadowduel.types.ActorSideEnum;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author avondale
 */
public class DealerMonitor {
    
    ReentrantLock lock = new ReentrantLock();
    private static DealerMonitor instance;
    public  boolean isEndThread = false;
    public static DealerMonitor getInstance()
    {
        if (instance == null) instance = new DealerMonitor();
        return instance;
    }
    
    private DealerMonitor()
    {
        
       
    }
    
    public void startMonitoring(
            ActorWrapper dealerWrapper, 
            Deck gameDeck
    )
    {
        var wk = new Worker(dealerWrapper, gameDeck);
        wk.start();
        
    }
    
    class Worker extends Thread
    {
         ActorWrapper dealerWrapper; 
         Deck gameDeck;
        public Worker( ActorWrapper dealerWrapper, 
            Deck gameDeck)
        {
            this.dealerWrapper = dealerWrapper;
            this.gameDeck = gameDeck;
        }
        @Override
        public void run() {
            while (!isEndThread)
//            while (true)
            {
                loop();
            }
            System.out.println("Dealer Thread is cutted. exited bot.");
        }
        
        public void loop()
        {
            lock.lock();
//            System.out.printf("is Player turn = %b\n", 
//                    String.valueOf(GameManager.getInstance().getIsPlayerTurn()));
            if (!GameManager.getInstance().isPlayerTurn())
            {
                GameManager.getInstance().turnBase();
            
                try 
                {
                   
                // bot turn now 
                    System.out.println("Bot is thinking.");
                     try {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException ex) {Logger.getLogger(DealerMonitor.class.getName()).log(Level.SEVERE, null, ex);}
              
                    // *********************************** 
                    // ## BOT BRAIN
                    
                    think();
                    
                    
                    try {
                        Thread.sleep(3000);
                    }
                    catch (InterruptedException ex) {Logger.getLogger(DealerMonitor.class.getName()).log(Level.SEVERE, null, ex);}
                }
                finally
                {
                    lock.unlock();
                }
                
                
            }else
            {
//                System.out.println(";");
            }
        }
        
        private void think()
        {
            double r = Math.random();
            System.out.println("RANDOM -------> " + r);
            if (r < 0.80)
            {
                dealerWrapper.hand.addNormalCardToHand(gameDeck.drawNormalCard(ActorSideEnum.Dealer));
            }
            else // magic call card
            {
                System.out.println("Bot have 20% chance to draw Magic Card.");
                if (!dealerWrapper.usedMagicCard)
                {
                    dealerWrapper.usedMagicCard = true;
    dealerWrapper.hand.setMagicCard(gameDeck.drawMagicCard(ActorSideEnum.Dealer));
    
    
                }
                if (Math.random() > 0.5)
    {
        dealerWrapper.hand.useMagicCard();
    }
            }

        }
    }
}
