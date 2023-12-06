/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel;
import java.util.LinkedList;

public class Hand {
    public LinkedList<Card> hand;
    private int handValue;
    private int count;
    
    public Hand()
    {
        hand = new LinkedList<>();
        handValue = 0;
        count = 0;  
    }
    
    public void addCard(Card c)
    {
        this.hand.add(c);
        handValue += c.getValue();
        count++;
    }
    
    public Card lastCard()
    {
        return hand.getLast();
    }
    
    public int getHandValue()
    {
        return handValue;
    }
    
    public int getNumberOfCards()
    {
        return count;
    } 
}
