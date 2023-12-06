/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel.Card;

import blackjackofshadowduel.types.ActorSideEnum;

public class Card extends AbstractCard
{
    private final int value;
    
    public Card (int theValue )
    {
        value = theValue;    
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getValueAsString() //return type to string
    {    
        switch ( value ) 
        {
           case 1:   return "1";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "11";
           case 12:  return "12";
           default:  return "Invalid Value Code";
        }
    }
    
    public String toString() //after return string tpye convert to string again, Otherwise info is data address
    {
        return getValueAsString();
    }

    @Override
    public void useCard(ActorSideEnum side) {
    }
    
    
}