/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackofshadowduel;

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
    
    public void endGame()
    {
        System.out.println("End game because heart is out of stock.");
        // ************** RESET GAME -> crate new JFrame of GamePage -> Delete Old one
        
    }
    
    
}
