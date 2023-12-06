/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackjackofshadowduel;
import javax.swing.*;
import java.awt.*;
import blackjackofshadowduel.Card.CardPanelWrapper;
import blackjackofshadowduel.types.GamestateEnums;



public class GamePage extends javax.swing.JFrame 
{   
    private static GamePage instance;
    public static String message;
    public static GamePage getInstance()
    {
        if (instance == null)
        {
            instance = new GamePage();
        }
        return instance;
    }
    
 
    Deck gameDeck = new Deck();
    Hand playerHand = new Hand();
    Hand dealerHand = new Hand();
    
    //MagicCard magic = new Magic();

    public GamePage() {
        initComponents();
        gameDeck.shuffle();
        dealInitialCards();
        initCards();
    }
    private void dealInitialCards() {
        playerHand.addCard(gameDeck.draw());
        PlayerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/" + playerHand.lastCard() + ".png")));

        dealerHand.addCard(gameDeck.draw());
        DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/" + dealerHand.lastCard() + ".png")));

        playerHand.addCard(gameDeck.draw());
        PlayerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/" + playerHand.lastCard() + ".png")));
    }
    
    private void initCards()
    {
        for (int i = 0; i < 4; i++)
        {
            CardPanelWrapper wrapper = new CardPanelWrapper();
//            wrapper.add(this)
            this.cardGridPanel.add(
                wrapper
            );
        }
    }
    
    private void decreaselifepoint()
    {
        Player_Panel.removeAll();
            int playerHeart = playerHand.getNumberOfCards();
            String pathToPlayerHeart = String.format("/HpPack/HPpack%d.png", playerHeart);
            
            var heartPanel = new javax.swing.JPanel();
            var heartLabel = new javax.swing.JLabel("Hrt");
            heartPanel.add(heartLabel);
            
            var imgIcon = new javax.swing.ImageIcon(getClass().getResource(pathToPlayerHeart));
            var img = imgIcon.getImage();
            
            img = img.getScaledInstance(
                    240, 30,
                    Image.SCALE_DEFAULT
            );
            heartLabel.setIcon(new ImageIcon(img));
            Player_Panel.add(heartPanel);
            revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayerScorePanel = new javax.swing.JPanel();
        ScoreLabel = new javax.swing.JLabel();
        Player_Panel = new javax.swing.JPanel();
        Dealer_Panel = new javax.swing.JPanel();
        cardGridPanel = new javax.swing.JPanel();
        magic = new javax.swing.JButton();
        hit = new javax.swing.JButton();
        rtomenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DealerCard4 = new javax.swing.JLabel();
        DealerCard3 = new javax.swing.JLabel();
        DealerCard2 = new javax.swing.JLabel();
        DealerCard1 = new javax.swing.JLabel();
        stand = new javax.swing.JButton();
        PlayerCard1 = new javax.swing.JLabel();
        PlayerCard2 = new javax.swing.JLabel();
        PlayerCard3 = new javax.swing.JLabel();
        PlayerCard4 = new javax.swing.JLabel();
        MagicCard = new javax.swing.JLabel();
        BGgame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayerScorePanel.setBackground(new java.awt.Color(51, 204, 255));
        PlayerScorePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PlayerScorePanel.setLayout(new java.awt.BorderLayout());

        ScoreLabel.setText("jLabel1");
        PlayerScorePanel.add(ScoreLabel, java.awt.BorderLayout.CENTER);

        getContentPane().add(PlayerScorePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 40, 40));

        Player_Panel.setBackground(new java.awt.Color(255, 102, 102));
        Player_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Player_Panel.setLayout(new java.awt.GridLayout(1, 6));
        getContentPane().add(Player_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 30));

        Dealer_Panel.setBackground(new java.awt.Color(153, 255, 204));
        Dealer_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Dealer_Panel.setLayout(new java.awt.GridLayout(1, 6));
        getContentPane().add(Dealer_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 240, 30));

        cardGridPanel.setBackground(new java.awt.Color(255, 153, 51));
        cardGridPanel.setLayout(new java.awt.GridLayout(1, 4, 25, 0));
        getContentPane().add(cardGridPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 430, 120));

        magic.setText("USE MAGIC CARD");
        getContentPane().add(magic, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        hit.setText("HIT");
        hit.setMaximumSize(new java.awt.Dimension(125, 23));
        hit.setMinimumSize(new java.awt.Dimension(125, 23));
        hit.setPreferredSize(new java.awt.Dimension(125, 23));
        hit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitActionPerformed(evt);
            }
        });
        getContentPane().add(hit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, 140, -1));

        rtomenu.setText("Return to menu");
        rtomenu.setPreferredSize(new java.awt.Dimension(125, 23));
        rtomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtomenuActionPerformed(evt);
            }
        });
        getContentPane().add(rtomenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 140, 20));

        jLabel1.setText("Deck");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        DealerCard4.setText("   ");
        getContentPane().add(DealerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 120, 140));

        DealerCard3.setText("   ");
        getContentPane().add(DealerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 110, 140));

        DealerCard2.setText("   ");
        getContentPane().add(DealerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 110, 140));

        DealerCard1.setBackground(new java.awt.Color(255, 255, 255));
        DealerCard1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DealerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 140));

        stand.setText("STAND");
        stand.setMaximumSize(new java.awt.Dimension(125, 23));
        stand.setMinimumSize(new java.awt.Dimension(125, 23));
        stand.setPreferredSize(new java.awt.Dimension(125, 23));
        stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standActionPerformed(evt);
            }
        });
        getContentPane().add(stand, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, 140, -1));

        PlayerCard1.setBackground(new java.awt.Color(255, 255, 255));
        PlayerCard1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PlayerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 110, 140));

        PlayerCard2.setBackground(new java.awt.Color(255, 255, 255));
        PlayerCard2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PlayerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 110, 140));

        PlayerCard3.setBackground(new java.awt.Color(255, 255, 255));
        PlayerCard3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PlayerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 110, 140));

        PlayerCard4.setBackground(new java.awt.Color(255, 255, 255));
        PlayerCard4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(PlayerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 110, 140));

        MagicCard.setBackground(new java.awt.Color(255, 255, 255));
        MagicCard.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(MagicCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 110, 140));

        BGgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesBG/1280x720.jpg"))); // NOI18N
        BGgame.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(BGgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rtomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtomenuActionPerformed
        // TODO add your handling code here:
        Start s = new Start();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_rtomenuActionPerformed

    private void hitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitActionPerformed
        // TODO add your handling code here:
        if(playerHand.getHandValue()<=21)
        {
            playerHand.addCard(gameDeck.draw());
            if(playerHand.getNumberOfCards()==3)
            PlayerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+playerHand.lastCard()+".png")));
            else if(playerHand.getNumberOfCards()==4)
            PlayerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+playerHand.lastCard()+".png")));
        }
    }//GEN-LAST:event_hitActionPerformed

    private void standActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standActionPerformed
        // TODO add your handling code here:
        do{
            dealerHand.addCard(gameDeck.draw());
            if(dealerHand.getNumberOfCards()==2){
                DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+dealerHand.lastCard()+".png")));
                }
            else if(dealerHand.getNumberOfCards()==3){
                DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+dealerHand.lastCard()+".png")));
            }
            else if(dealerHand.getNumberOfCards()==4){
                DealerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+dealerHand.lastCard()+".png")));  
            }
        }while (dealerHand.getHandValue() <= 18);     

        GamestateEnums winner = GameManager.getInstance().isPlayerwin(playerHand, dealerHand);

        switch (winner) {
            case Win:
                message = "You Win!";
                break;
            case Lose:
                message = "You Lose!";
                decreaselifepoint();
                break;
            case Draw:
                message = "It's a Draw!";
                break;
            default:
                message = "";
        }

            Result resultFrame = new Result();
            resultFrame.setMessage(GamePage.message);
            resultFrame.setVisible(true);
    }//GEN-LAST:event_standActionPerformed
    public void resetGame() {
        initComponents();
        gameDeck.shuffle();
        dealInitialCards();
        initCards();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGgame;
    private javax.swing.JLabel DealerCard1;
    private javax.swing.JLabel DealerCard2;
    private javax.swing.JLabel DealerCard3;
    private javax.swing.JLabel DealerCard4;
    private javax.swing.JPanel Dealer_Panel;
    private javax.swing.JLabel MagicCard;
    private javax.swing.JLabel PlayerCard1;
    private javax.swing.JLabel PlayerCard2;
    private javax.swing.JLabel PlayerCard3;
    private javax.swing.JLabel PlayerCard4;
    private javax.swing.JPanel PlayerScorePanel;
    private javax.swing.JPanel Player_Panel;
    private javax.swing.JLabel ScoreLabel;
    private javax.swing.JPanel cardGridPanel;
    private javax.swing.JButton hit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton magic;
    private javax.swing.JButton rtomenu;
    private javax.swing.JButton stand;
    // End of variables declaration//GEN-END:variables
}
