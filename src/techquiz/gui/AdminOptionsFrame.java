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
public class AdminOptionsFrame extends javax.swing.JFrame {
    
    
        public AdminOptionsFrame() {
            this.setTitle("Admin Options - "+"OnlineTechQuizApp");
            initComponents();
             this.setLocationRelativeTo(null);
             lblUser.setText("Hello "+UserProfile.getUserName());
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
        panelAdminOptions = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblAdmin = new javax.swing.JLabel();
        lblChoice = new javax.swing.JLabel();
        lblAdminImage = new javax.swing.JLabel();
        jrbSetPaper = new javax.swing.JRadioButton();
        jrbEditPaper = new javax.swing.JRadioButton();
        jrbRegisterStudent = new javax.swing.JRadioButton();
        jrbViewScores = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        panelAdminOptions.setBackground(new java.awt.Color(87, 79, 82));
        panelAdminOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAdminOptionsMouseClicked(evt);
            }
        });

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(153, 204, 0));
        lblUser.setText("Hello User");

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 153, 0));
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

        lblAdmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(102, 102, 255));
        lblAdmin.setText("ONLINE QUIZ ADMINISTRATION PANEL");

        lblChoice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChoice.setForeground(new java.awt.Color(153, 204, 0));
        lblChoice.setText("Make A Choice");

        lblAdminImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/appimages/admin (2).png"))); // NOI18N

        jrbSetPaper.setBackground(new java.awt.Color(87, 79, 82));
        buttonGroup1.add(jrbSetPaper);
        jrbSetPaper.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSetPaper.setForeground(new java.awt.Color(153, 204, 0));
        jrbSetPaper.setText("Set A Paper");

        jrbEditPaper.setBackground(new java.awt.Color(87, 79, 82));
        buttonGroup1.add(jrbEditPaper);
        jrbEditPaper.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbEditPaper.setForeground(new java.awt.Color(153, 204, 0));
        jrbEditPaper.setText("Edit Paper");

        jrbRegisterStudent.setBackground(new java.awt.Color(87, 79, 82));
        buttonGroup1.add(jrbRegisterStudent);
        jrbRegisterStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbRegisterStudent.setForeground(new java.awt.Color(153, 204, 0));
        jrbRegisterStudent.setText("Register Student");

        jrbViewScores.setBackground(new java.awt.Color(87, 79, 82));
        buttonGroup1.add(jrbViewScores);
        jrbViewScores.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbViewScores.setForeground(new java.awt.Color(153, 204, 0));
        jrbViewScores.setText("View Scores");

        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(153, 102, 0));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdminOptionsLayout = new javax.swing.GroupLayout(panelAdminOptions);
        panelAdminOptions.setLayout(panelAdminOptionsLayout);
        panelAdminOptionsLayout.setHorizontalGroup(
            panelAdminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                .addGroup(panelAdminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblChoice))
                    .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblAdmin))
                    .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                        .addGroup(panelAdminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                                .addComponent(lblAdminImage, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminOptionsLayout.createSequentialGroup()
                                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGroup(panelAdminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbSetPaper)
                            .addComponent(jrbEditPaper)
                            .addComponent(jrbRegisterStudent)
                            .addComponent(jrbViewScores))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminOptionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelAdminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminOptionsLayout.createSequentialGroup()
                        .addComponent(lblLogout)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdminOptionsLayout.createSequentialGroup()
                        .addComponent(btnDoTask)
                        .addGap(159, 159, 159))))
        );
        panelAdminOptionsLayout.setVerticalGroup(
            panelAdminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogout)
                .addGap(18, 18, 18)
                .addComponent(lblAdmin)
                .addGap(18, 18, 18)
                .addComponent(lblChoice)
                .addGap(18, 18, 18)
                .addGroup(panelAdminOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                        .addComponent(jrbSetPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbEditPaper)
                        .addGap(18, 18, 18)
                        .addComponent(jrbRegisterStudent)
                        .addGap(18, 18, 18)
                        .addComponent(jrbViewScores)
                        .addGap(30, 30, 30)
                        .addComponent(btnDoTask))
                    .addGroup(panelAdminOptionsLayout.createSequentialGroup()
                        .addComponent(lblAdminImage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdminOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdminOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
       lblLogout.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,14);
        lblLogout.setFont(f);
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        lblLogout.setCursor(c);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
         lblLogout.setForeground(new Color(255,153,0));
         Font f=new Font("Tahoma",Font.BOLD,14);
         lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
      this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);

    }//GEN-LAST:event_lblLogoutMouseClicked

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(jrbSetPaper.isSelected())
        {
            SetPaperFrame setPaperFrame=new SetPaperFrame();
            setPaperFrame.setVisible(true);
        }
        else if(jrbEditPaper.isSelected())
        {
            EditPaperFrame editPaperFrame=new EditPaperFrame();
            editPaperFrame.setVisible(true);
        }
        else if(jrbRegisterStudent.isSelected())
        {
            RegisterStudentFrame regFrame=new RegisterStudentFrame();
            regFrame.setVisible(true);
        }
        else if(jrbViewScores.isSelected())
        {
            ViewScoresFrame viewScoresFrame=new ViewScoresFrame();
            viewScoresFrame.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Choose An Option","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.dispose();
        

    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void panelAdminOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAdminOptionsMouseClicked
   buttonGroup1.clearSelection();
    }//GEN-LAST:event_panelAdminOptionsMouseClicked

    
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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jrbEditPaper;
    private javax.swing.JRadioButton jrbRegisterStudent;
    private javax.swing.JRadioButton jrbSetPaper;
    private javax.swing.JRadioButton jrbViewScores;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblAdminImage;
    private javax.swing.JLabel lblChoice;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel panelAdminOptions;
    // End of variables declaration//GEN-END:variables
}