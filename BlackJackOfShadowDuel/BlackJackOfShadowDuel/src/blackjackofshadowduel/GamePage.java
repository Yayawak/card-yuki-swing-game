/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package blackjackofshadowduel;
import javax.swing.*;
import java.awt.*;
import blackjackofshadowduel.Card.CardPanelWrapper;
import blackjackofshadowduel.types.GamestateEnums;
import blackjackofshadowduel.Heart.HeartSystem;
import blackjackofshadowduel.types.ActorSideEnum;


class ActorWrapper
{
    public ActorSideEnum side;
    public HeartSystem heartSys;
    public Hand hand;
    public boolean usedMagicCard = false;
    
    public ActorWrapper(ActorSideEnum side, Hand hand,
            HeartSystem heartSys)
    {
       this.side = side;
       this.hand = hand;
       this.heartSys = heartSys;
    }
    
    
}

public class GamePage extends javax.swing.JFrame 
{
    Deck gameDeck = Deck.getInstance();
    private static GamePage instance;
    public static GamePage getInstance() { if(instance == null) {instance = new GamePage();} return instance; }
//    Hand playerHand = new Hand();
//    Hand dealerHand = new Hand();
    //MagicCard magic = new Magic();
    ActorWrapper pywp = null;
    ActorWrapper dlwp = null;
    public GamePage() {
        initComponents();
        pywp = new ActorWrapper(ActorSideEnum.Player,
            new Hand(playerMagicPanel, playerScorePanel, playerCardGridPanel)
                , 
            new HeartSystem(playerHeartPanel)
        );
        dlwp = new ActorWrapper(ActorSideEnum.Dealer,
            new Hand(null, null, null),
            new HeartSystem(null)
        );
         
        
        gameDeck.shuffle();
        
//        playerHand.addCard(gameDeck.draw());
//        PlayerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+playerHand.lastCard()+".png")));
//      
//        dealerHand.addCard(gameDeck.draw());
//        DealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+dealerHand.lastCard()+".png")));
//        
//        playerHand.addCard(gameDeck.draw());
//        PlayerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+playerHand.lastCard()+".png")));
         
        
//        initUIs();
        
//        GameManager.getInstance()
        
    }
    
    private void initUIs()
    {
        
    }
    
    private void decreaselifepoint()
    {

        playerHeartPanel.removeAll();

            int playerHeart = pywp.hand.getNumberOfCards();
            String pathToPlayerHeart = String.format("/HpPack/HPpack0%d.png", playerHeart);
            
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
            playerHeartPanel.add(heartPanel);

            
            
            revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonsPanel = new javax.swing.JPanel();
        drawMagicBtn = new javax.swing.JButton();
        hitBtn = new javax.swing.JButton();
        stand = new javax.swing.JButton();
        useMagicBtn = new javax.swing.JButton();
        dealerParts = new javax.swing.JPanel();
        dealerCardGridPanel = new javax.swing.JPanel();
        dealerHeartPanel = new javax.swing.JPanel();
        dealerScorePanel = new javax.swing.JPanel();
        dealerMagicPanel = new javax.swing.JPanel();
        rtomenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        playerParts = new javax.swing.JPanel();
        playerCardGridPanel = new javax.swing.JPanel();
        playerHeartPanel = new javax.swing.JPanel();
        playerScorePanel = new javax.swing.JPanel();
        playerMagicPanel = new javax.swing.JPanel();
        DealerCard4 = new javax.swing.JLabel();
        DealerCard3 = new javax.swing.JLabel();
        DealerCard2 = new javax.swing.JLabel();
        DealerCard1 = new javax.swing.JLabel();
        PlayerCard1 = new javax.swing.JLabel();
        PlayerCard2 = new javax.swing.JLabel();
        PlayerCard3 = new javax.swing.JLabel();
        PlayerCard4 = new javax.swing.JLabel();
        MagicCard = new javax.swing.JLabel();
        MagicCard1 = new javax.swing.JLabel();
        BGgame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonsPanel.setBackground(new java.awt.Color(204, 255, 204));
        buttonsPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        drawMagicBtn.setBackground(new java.awt.Color(153, 153, 255));
        drawMagicBtn.setText("DRAW MAGIC CARD");
        drawMagicBtn.setMaximumSize(new java.awt.Dimension(125, 23));
        drawMagicBtn.setMinimumSize(new java.awt.Dimension(125, 23));
        drawMagicBtn.setPreferredSize(new java.awt.Dimension(125, 23));
        drawMagicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawMagicBtnActionPerformed(evt);
            }
        });
        buttonsPanel.add(drawMagicBtn);

        hitBtn.setBackground(new java.awt.Color(255, 102, 51));
        hitBtn.setText("HIT");
        hitBtn.setMaximumSize(new java.awt.Dimension(125, 23));
        hitBtn.setMinimumSize(new java.awt.Dimension(125, 23));
        hitBtn.setPreferredSize(new java.awt.Dimension(125, 23));
        hitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitBtnActionPerformed(evt);
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
        buttonsPanel.add(hitBtn);

        stand.setBackground(new java.awt.Color(255, 0, 255));
        stand.setText("STAND");
        stand.setMaximumSize(new java.awt.Dimension(125, 23));
        stand.setMinimumSize(new java.awt.Dimension(125, 23));
        stand.setPreferredSize(new java.awt.Dimension(125, 23));
        stand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standActionPerformed(evt);
            }
        });
        buttonsPanel.add(stand);

        useMagicBtn.setBackground(new java.awt.Color(0, 153, 51));
        useMagicBtn.setText("USE MAGIC CARD");
        buttonsPanel.add(useMagicBtn);

        getContentPane().add(buttonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 150, 170));

        dealerParts.setBackground(new java.awt.Color(255, 102, 255));

        dealerCardGridPanel.setBackground(new java.awt.Color(255, 153, 51));
        dealerCardGridPanel.setLayout(new java.awt.GridLayout(1, 4, 25, 0));

        dealerHeartPanel.setBackground(new java.awt.Color(255, 102, 102));
        dealerHeartPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dealerHeartPanel.setLayout(new java.awt.GridLayout(1, 6));

        dealerScorePanel.setBackground(new java.awt.Color(51, 204, 255));
        dealerScorePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dealerScorePanel.setLayout(new java.awt.BorderLayout());

        dealerMagicPanel.setBackground(new java.awt.Color(51, 204, 255));
        dealerMagicPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dealerMagicPanel.setLayout(new java.awt.GridLayout());

        rtomenu.setText("Return to menu");
        rtomenu.setPreferredSize(new java.awt.Dimension(125, 23));
        rtomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtomenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dealerPartsLayout = new javax.swing.GroupLayout(dealerParts);
        dealerParts.setLayout(dealerPartsLayout);
        dealerPartsLayout.setHorizontalGroup(
            dealerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dealerPartsLayout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addGroup(dealerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtomenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealerPartsLayout.createSequentialGroup()
                        .addGroup(dealerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealerPartsLayout.createSequentialGroup()
                                .addComponent(dealerScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dealerHeartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dealerPartsLayout.createSequentialGroup()
                                .addComponent(dealerMagicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dealerCardGridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        dealerPartsLayout.setVerticalGroup(
            dealerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dealerPartsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtomenu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dealerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dealerCardGridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealerMagicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dealerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dealerHeartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dealerScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(dealerParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 790, 290));

        playerParts.setBackground(new java.awt.Color(204, 255, 255));

        playerCardGridPanel.setBackground(new java.awt.Color(255, 153, 51));
        playerCardGridPanel.setLayout(new java.awt.GridLayout(1, 4, 25, 0));

        playerHeartPanel.setBackground(new java.awt.Color(255, 102, 102));
        playerHeartPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerHeartPanel.setLayout(new java.awt.GridLayout(1, 6));

        playerScorePanel.setBackground(new java.awt.Color(51, 204, 255));
        playerScorePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerScorePanel.setLayout(new java.awt.BorderLayout());

        playerMagicPanel.setBackground(new java.awt.Color(51, 204, 255));
        playerMagicPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playerMagicPanel.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout playerPartsLayout = new javax.swing.GroupLayout(playerParts);
        playerParts.setLayout(playerPartsLayout);
        playerPartsLayout.setHorizontalGroup(
            playerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerPartsLayout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addComponent(playerMagicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
            .addGroup(playerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playerPartsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(playerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(playerPartsLayout.createSequentialGroup()
                            .addComponent(playerHeartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(playerScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(playerPartsLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(playerCardGridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 349, Short.MAX_VALUE)))
        );
        playerPartsLayout.setVerticalGroup(
            playerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerPartsLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(playerMagicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(playerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(playerPartsLayout.createSequentialGroup()
                    .addGap(0, 125, Short.MAX_VALUE)
                    .addGroup(playerPartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(playerHeartPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(playerScorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(playerCardGridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 5, Short.MAX_VALUE)))
        );

        getContentPane().add(playerParts, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 790, 290));

        DealerCard4.setText("   ");
        getContentPane().add(DealerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 120, 140));

        DealerCard3.setText("   ");
        getContentPane().add(DealerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 110, 140));

        DealerCard2.setText("   ");
        getContentPane().add(DealerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 110, 140));

        DealerCard1.setBackground(new java.awt.Color(255, 255, 255));
        DealerCard1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(DealerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, 140));

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
        MagicCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesBG/backcard.jpeg"))); // NOI18N
        getContentPane().add(MagicCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 110, 140));

        MagicCard1.setBackground(new java.awt.Color(255, 255, 255));
        MagicCard1.setForeground(new java.awt.Color(255, 255, 255));
        MagicCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesBG/backmagiccard.jpeg"))); // NOI18N
        getContentPane().add(MagicCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 110, 140));

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

    private void hitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitBtnActionPerformed
        // TODO add your handling code here:
       
        if(pywp.hand.getHandValue()<=21)
        {
               
            pywp.hand.addNormalCardToHand(gameDeck.drawNormalCard());
//            if(pywp.hand.getNumberOfCards()==3)
//            PlayerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+pywp.hand.lastCard()+".png")));
//            else if(pywp.hand.getNumberOfCards()==4)
//            PlayerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+pywp.hand.lastCard()+".png")));
        }
        
//        A();
 
    }//GEN-LAST:event_hitBtnActionPerformed

    private void standActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standActionPerformed
        // TODO add your handling code here:
        do{
            dlwp.hand.addNormalCardToHand(gameDeck.drawNormalCard());
//            if(dlwp.hand.getNumberOfCards()==2){
//                DealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+dlwp.hand.lastCard()+".png")));
//                }
//            else if(dlwp.hand.getNumberOfCards()==3){
//                DealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+dlwp.hand.lastCard()+".png")));
//            }
//            else if(dlwp.hand.getNumberOfCards()==4){
//                DealerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BasicDeck/"+dlwp.hand.lastCard()+".png")));  
//            }
        }while (dlwp.hand.getHandValue() < 16);       

        GamestateEnums result = GameManager.getInstance().isPlayerwin(playerHand, dealerHand);

        switch (result) {
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
    
            

    private void drawMagicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawMagicBtnActionPerformed
        System.out.println("clicked on drawMagicCard");
        if (!pywp.usedMagicCard)
        {
            
            pywp.hand.setMagicCard(gameDeck.drawMagicCard());
            pywp.usedMagicCard = true;
        }
            
    }//GEN-LAST:event_drawMagicBtnActionPerformed

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
    private javax.swing.JLabel MagicCard;
    private javax.swing.JLabel MagicCard1;
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
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel dealerCardGridPanel;
    private javax.swing.JPanel dealerHeartPanel;
    private javax.swing.JPanel dealerMagicPanel;
    private javax.swing.JPanel dealerParts;
    private javax.swing.JPanel dealerScorePanel;
    private javax.swing.JButton drawMagicBtn;
    private javax.swing.JButton hitBtn;
    private javax.swing.JPanel playerCardGridPanel;
    private javax.swing.JPanel playerHeartPanel;
    private javax.swing.JPanel playerMagicPanel;
    private javax.swing.JPanel playerParts;
    private javax.swing.JPanel playerScorePanel;
    private javax.swing.JButton rtomenu;
    private javax.swing.JButton stand;
    private javax.swing.JButton useMagicBtn;
    // End of variables declaration//GEN-END:variables
}
