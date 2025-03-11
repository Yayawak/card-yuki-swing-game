// GameManager.java
package blackjackofshadowduel;

import blackjackofshadowduel.types.GamestateEnums;

public class GameManager {
    private static GameManager instance;

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    private GameManager() {
        
    }

    public GamestateEnums isPlayerwin(Hand playerHand, Hand dealerHand) {
        int playerHandValue = playerHand.getHandValue();
        int dealerHandValue = dealerHand.getHandValue();
        
        if (playerHandValue == 21 && dealerHandValue != 21) {
            return GamestateEnums.Win;
        } else if (dealerHandValue == 21 && playerHandValue != 21) {
            return GamestateEnums.Lose;
        } else if (playerHandValue > 21 && dealerHandValue <= 21) {
            return GamestateEnums.Lose;
        } else if (dealerHandValue > 21 && playerHandValue <= 21) {
            return GamestateEnums.Win;
        } else if (playerHandValue > 21 && dealerHandValue > 21) {
            return GamestateEnums.Draw;
        }else if (playerHandValue == 21 && dealerHandValue == 21) {
            return GamestateEnums.Draw;
        }

        int playerDifference = Math.abs(playerHandValue - 21);
        int dealerDifference = Math.abs(dealerHandValue - 21);

        if (playerDifference < dealerDifference) {
            return GamestateEnums.Win;
        } else if (playerDifference > dealerDifference) {
            return GamestateEnums.Lose;
        } else {
            return GamestateEnums.Draw;
        }
    }
    
    public void endGame()
    {
        System.out.println("End game because heart is out of stock.");
        // ************** RESET GAME -> crate new JFrame of GamePage -> Delete Old one
        
    }
    
    
}
