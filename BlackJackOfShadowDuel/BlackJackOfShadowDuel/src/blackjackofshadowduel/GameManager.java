/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel;

import blackjackofshadowduel.types.BlackjackEnums;

/**
 *
 * @author avondale
 */
public class GameManager {
    private static GameManager instance;
    
    public static GameManager getInstance()
    {
        if (instance == null)
        {
            instance = new GameManager();
        }
        return instance;
    }
    
    private GameManager()
    {
        
    }
    
    
}

    
     

