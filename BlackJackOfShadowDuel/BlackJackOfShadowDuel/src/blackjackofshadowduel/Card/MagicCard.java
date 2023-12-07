/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel.Card;

import blackjackofshadowduel.GameManager;
import blackjackofshadowduel.types.ActorSideEnum;
import blackjackofshadowduel.Hand;
import blackjackofshadowduel.types.GamestateEnums;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Sigsauer
 */
public class MagicCard extends AbstractCard {
    
    public final static int cd = 0;
    public final static int er = 1;
    public final static int ff = 2;
    public final static int ls = 3;
    public final static int pg = 4;
    
    private final int magiccard;
    
    private boolean canPlayCard = true;
    
    public MagicCard (int theMagic, String pathToCard){
        magiccard = theMagic;
//        System.out.printf("Magic Card : %s\n", pathToCard);
        super.setImage(pathToCard);
        
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            {
                System.out.println("clicked on MagicCard");
                
                useCard(theMagic);
            }
        });
        
    }
    
     public int getMagic(){
       
        return magiccard;
    }
     
     
     public String getMagicAsString(){
        switch ( magiccard ) 
        {
            case cd: return "cd";
            case er: return "er";
            case ff: return "ff";
            case ls: return "ls";
            case pg: return "pg";
            default:  return "Invalid Value Code";
        }
    }    
     
    @Override
    public void useCard(ActorSideEnum side) 
    {
       if (canPlayCard) {
//            if (side == ActorSideEnum.Player) {
//                // Actions for the player side
//            } else {
//                // Actions for the opponent side
//            }
        }
    }
     
    public void ForceField(ActorSideEnum side){
        canPlayCard = false;
    }
    
    public void LightningStorm(ActorSideEnum side){
        pywp.heartSys.decreaseHeart();
        dlwp.heartSys.decreaseHeart();
    }
    
    public void CompositionDepartment(ActorSideEnum side,Hand player,Hand dealer){
        GamestateEnums result = GameManager.getInstance().isPlayerwin(player, dealer);
        if(side == ActorSideEnum.Player){
            //protection
        }else{
            
        }
    }
    
    public void ExplosionRune(ActorSideEnum side,Hand player,Hand dealer){
        GamestateEnums result = GameManager.getInstance().isPlayerwin(player, dealer);
        if(side == ActorSideEnum.Player){
            if(result == GamestateEnums.Win){
                pywp.heartSys.decreaseHeart();
            }else if(result == GamestateEnums.Lose){
                dlwp.heartSys.decreaseHeart();
            }
        }else{
            if(result == GamestateEnums.Win){
                dlwp.heartSys.decreaseHeart();
            }else if(result == GamestateEnums.Lose){
                pywp.heartSys.decreaseHeart();
            }
        }
    }
    
    public void PoisonedArrow(ActorSideEnum side,Hand player,Hand dealer){
        GamestateEnums result = GameManager.getInstance().isPlayerwin(player, dealer);
        if(side == ActorSideEnum.Player ){
            if(result == GamestateEnums.Win){
                dlwp.heartSys.decreaseHeart();
            }
        }else{
            if(result == GamestateEnums.Lose){
                pywp.heartSys.decreaseHeart();
            }
        }
    }
}
 