/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel.Card;
import blackjackofshadowduel.types.ActorSideEnum;

import blackjackofshadowduel.types.ActorSideEnum;

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
    
    
    
    public MagicCard (int theMagic, String pathToCard){
        magiccard = theMagic;
        super.pathToCard = pathToCard;
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
        if (side == ActorSideEnum.Player)
        {
            
        }
        else
        {
            
        }
    }
     
    public void magicCardskill(int magiccard,ActorSideEnum side){
        if(side == ActorSideEnum.Player){
            switch (magiccard) {
                case 0:
                    
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }else{
            switch (magiccard) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }
    }
}
 