/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel.Card;
import blackjackofshadowduel.types.ActorSideEnum;
import javax.swing.*;
/**
 *
 * @author avondale
 */
public abstract class AbstractCard extends JPanel {
    public JLabel imageLabel = new JLabel();
    public String pathToCard ;
    public abstract void useCard(ActorSideEnum side);
}
