/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel;
import blackjackofshadowduel.Card.Card;
import blackjackofshadowduel.Card.MagicCard;
import java.util.Collections;
import java.util.LinkedList;

public class Deck
{
    private final  LinkedList<Card> cardDeck; 
    private final  LinkedList<MagicCard> magicDeck;
    
    public Deck()
    {
        cardDeck = new LinkedList<>();
        magicDeck = new LinkedList<>();
      
        for(int i = 1; i < 13; i++)
        {    
            this.cardDeck.add(new Card(i));
        }
      
        for(int i = 1; i < 6; i++)
        {    
            this.magicDeck.add(new MagicCard(i));
        }
    }
    
    public void shuffle()
    {
        Collections.shuffle(this.cardDeck);
        Collections.shuffle(this.magicDeck);
    }
    
    public Card draw()
    {
        return cardDeck.pop();
      
    }
}
