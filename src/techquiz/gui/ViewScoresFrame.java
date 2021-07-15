/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techquiz.gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JOptionPane;
import techquiz.pojo.UserProfile;

/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class ViewScoresFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewScoresFrame
     */
    public ViewScoresFrame() {
        this.setTitle("View Scores - "+"OnlineTechQuizApp");
        initComponents();
        lblUser.setText("Hello "+UserProfile.getUserName());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        viewScoresPanel = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblViewScorePanel = new javax.swing.JLabel();
        lblMakeChoice = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrbViewSingleScore = new javax.swing.JRadioButton();
        jrbViewAllScore = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        viewScoresPanel.setBackground(new java.awt.Color(102, 153, 255));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(153, 255, 153));
        lblUser.setText("Hello  ");

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(153, 255, 153));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblViewScorePanel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        lblViewScorePanel.setForeground(new java.awt.Color(255, 204, 51));
        lblViewScorePanel.setText("VIEW SCORE PANEL");

        lblMakeChoice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMakeChoice.setForeground(new java.awt.Color(153, 255, 153));
        lblMakeChoice.setText("Make A Choice");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/appimages/l&t-logo.PNG"))); // NOI18N

        jrbViewSingleScore.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(jrbViewSingleScore);
        jrbViewSingleScore.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jrbViewSingleScore.setForeground(new java.awt.Color(255, 255, 102));
        jrbViewSingleScore.setText("View Score Of A Single Student");

        jrbViewAllScore.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(jrbViewAllScore);
        jrbViewAllScore.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jrbViewAllScore.setForeground(new java.awt.Color(255, 255, 102));
        jrbViewAllScore.setText("View All Student Score");

        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 102, 0));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 102, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewScoresPanelLayout = new javax.swing.GroupLayout(viewScoresPanel);
        viewScoresPanel.setLayout(viewScoresPanelLayout);
        viewScoresPanelLayout.setHorizontalGroup(
            viewScoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewScoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addContainerGap())
            .addGroup(viewScoresPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblViewScorePanel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(viewScoresPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewScoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewScoresPanelLayout.createSequentialGroup()
                        .addGroup(viewScoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(viewScoresPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnDoTask)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack))
                            .addComponent(jrbViewSingleScore)
                            .addComponent(jrbViewAllScore))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewScoresPanelLayout.createSequentialGroup()
                        .addComponent(lblMakeChoice)
                        .addGap(179, 179, 179))))
        );
        viewScoresPanelLayout.setVerticalGroup(
            viewScoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewScoresPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewScoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogout)
                    .addComponent(lblUser))
                .addGap(20, 20, 20)
                .addComponent(lblViewScorePanel)
                .addGap(36, 36, 36)
                .addGroup(viewScoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewScoresPanelLayout.createSequentialGroup()
                        .addComponent(lblMakeChoice)
                        .addGap(26, 26, 26)
                        .addComponent(jrbViewSingleScore)
                        .addGap(38, 38, 38)
                        .addComponent(jrbViewAllScore))
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(viewScoresPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoTask)
                    .addComponent(btnBack))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewScoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewScoresPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
    AdminOptionsFrame adminOption=new AdminOptionsFrame();
    adminOption.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
      if(buttonGroup1.isSelected(null))
      {
          JOptionPane.showMessageDialog(null, "Please Make A choice");
          return;
      }
      if(jrbViewSingleScore.isSelected())
      {
       ViewSingleScoreFrame single=new ViewSingleScoreFrame();
       single.setVisible(true);
      }
      else
      {
        ViewAllScoreFrame allScore=new ViewAllScoreFrame();
        allScore.setVisible(true);
      }
      this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
   lblLogout.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,14);
        lblLogout.setFont(f);
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        lblLogout.setCursor(c);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
         lblLogout.setForeground(new Color(153,255,153));
         Font f=new Font("Tahoma",Font.BOLD,14);
         lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(ViewScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewScoresFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewScoresFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jrbViewAllScore;
    private javax.swing.JRadioButton jrbViewSingleScore;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMakeChoice;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblViewScorePanel;
    private javax.swing.JPanel viewScoresPanel;
    // End of variables declaration//GEN-END:variables
}