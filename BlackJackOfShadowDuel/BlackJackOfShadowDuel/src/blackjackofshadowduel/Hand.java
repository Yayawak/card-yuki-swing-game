/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel;
import blackjackofshadowduel.Card.*;
import java.util.LinkedList;
import javax.swing.*;

public class Hand {
//    private final LinkedList<Card> hand;
    private Card[] hand = new Card[4];
    private MagicCard magicCardOnHand = null;
    private int handValue;
    private int count;
    private JPanel magicPanel;
    private JPanel sumScorePanel;
    private JPanel cardGridPanel;
    private CardPanelWrapper[] cardWrappers = new CardPanelWrapper[4];
    
    public Hand(JPanel magicPanel, JPanel sumScorePanel,
            JPanel cardGridPanel)
    {
        this.magicPanel = magicPanel;
        this.sumScorePanel = sumScorePanel;
        this.cardGridPanel = cardGridPanel;
        
//        hand = new LinkedList<>();
        handValue = 0;
        count = 0;
            
        if (this.cardGridPanel != null)
            initCardWrappers();
    }
    
    private void initCardWrappers()
    {
        for (int i = 0; i < 4; i++)
        {
            CardPanelWrapper wrapper = new CardPanelWrapper();
            cardWrappers[i] = wrapper;
            this.cardGridPanel.add(
                wrapper
            );
        }
    }
    
    public void addNormalCardToHand(Card c)
    {
        System.out.println("Try to draw normal card.");
        this.hand[count] = c;
        handValue += c.getValue();
        updateNormalCardUI();
        updateSumScoreUI();
        
        count++;
    }
  
    private void updateNormalCardUI()
    {
//        cardGridPanel.removeAll();
        
//        for (Card c : hand)
//        {
//            cardGridPanel.add(c);
//        }
        for (int i = 0; i < 4; i++)
        {
            var wp = cardWrappers[i];
            wp.removeAll();
            if (hand[i] != null)
                wp.add(
                   hand[i]
                );
            wp.revalidate();
        }
//        cardGridPanel.revalidate();
    }
    
    private void updateMagicCardUI()
    {
//        JLabel scoreLb = new JLabel(
//            String.valueOf(handValue)
//        );
        magicPanel.removeAll();
        magicPanel.add(scoreLb);
        magicPanel.revalidate();
    }
    
    private void updateSumScoreUI()
    {
        JLabel scoreLb = new JLabel(
            String.valueOf(handValue)
        );
        sumScorePanel.removeAll();
        sumScorePanel.add(scoreLb);
        sumScorePanel.revalidate();
    }
//    
//    public AbstractCard lastCard()
//    {
//        return hand.getLast();
//    }
    
    public int getHandValue()
    {
        return handValue;
    }
    
    public int getNumberOfCards()
    {
        return count;
    } 
    
}
