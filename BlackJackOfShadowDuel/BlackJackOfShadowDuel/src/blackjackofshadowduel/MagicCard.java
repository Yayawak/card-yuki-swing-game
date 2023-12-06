/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel;

/**
 *
 * @author Sigsauer
 */
public class MagicCard {
    
    public final static int cd = 0;
    public final static int er = 1;
    public final static int ff = 2;
    public final static int ls = 3;
    public final static int pg = 4;
    
    private final int magiccard;
    
    
    
    public MagicCard (int theMagic ){
        magiccard = theMagic;    
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
}
