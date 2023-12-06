/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel.Card;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author avondale
 */
public class CardPanelWrapper extends JPanel {
    public CardPanelWrapper()
    {
        this.setLayout(new BorderLayout());
//        this.setPreferredSize(preferredSize);
//        this.setPreferredSize(new Dimension(110, 140));
        this.setBackground(Color.red);
    }
    
    public void setCard(Card c)
    {
        removeAll();
        add(c, BorderLayout.CENTER);
        revalidate();
    }
}
