/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techquiz.gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import techquiz.dao.ExamDAO;
import techquiz.pojo.ExamPOJO;
import techquiz.pojo.UserProfile;

/**
 *
 * @author SHUBHAM MANMOHAN
 */
public class ChoosePaperFrame extends javax.swing.JFrame {

    
    String subjectName;
     
    /**
     * Creates new form ChoosePaperFrame
     */
    public ChoosePaperFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcbSubject = new javax.swing.JComboBox();
        jcbExamId = new javax.swing.JComboBox();
        lblUser = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblPaperSelectionPanel = new javax.swing.JLabel();
        lblFillPaperDetails = new javax.swing.JLabel();
        lblChooseTheSubject = new javax.swing.JLabel();
        btnTakeTest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techquiz/gui/appimages/examicon - Copy.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Choose The ExamId:");

        jcbSubject.setMaximumRowCount(4);
        jcbSubject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "JAVA SE", "JAVA EE", "C++", "C", "PYTHON", ".NET", "DATA STRUCTURE ", "ORACLE", "WEB DEVELOPMENT", "OOP" }));
        jcbSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSubjectActionPerformed(evt);
            }
        });

        jcbExamId.setMaximumRowCount(4);

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 102, 0));
        lblUser.setText("Hello");

        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 102, 0));
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

        lblPaperSelectionPanel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPaperSelectionPanel.setForeground(new java.awt.Color(204, 204, 255));
        lblPaperSelectionPanel.setText("PAPER SELECTION PANEL");

        lblFillPaperDetails.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblFillPaperDetails.setForeground(new java.awt.Color(204, 102, 0));
        lblFillPaperDetails.setText("Fill Paper Details  ::");

        lblChooseTheSubject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChooseTheSubject.setForeground(new java.awt.Color(255, 153, 102));
        lblChooseTheSubject.setText("Choose the Subject :");

        btnTakeTest.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        btnTakeTest.setText("Take The Test");
        btnTakeTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTakeTestActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblChooseTheSubject)
                            .addGap(367, 367, 367))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(lblFillPaperDetails))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblPaperSelectionPanel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTakeTest)
                .addGap(106, 106, 106)
                .addComponent(btnBack)
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPaperSelectionPanel)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFillPaperDetails)
                        .addGap(33, 33, 33)
                        .addComponent(lblChooseTheSubject)
                        .addGap(28, 28, 28)
                        .addComponent(jcbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jcbExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTakeTest)
                    .addComponent(btnBack))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(new Color(255,102,0));
        Font f=new Font("Tahoma",Font.BOLD,14);
        lblLogout.setFont(f);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.WHITE);
        Font f=new Font("Tahoma",Font.ITALIC,14);
        lblLogout.setFont(f);
        Cursor c=new Cursor(Cursor.HAND_CURSOR);
        lblLogout.setCursor(c);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jcbSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSubjectActionPerformed
    jcbExamId.removeAllItems();        
 	boolean result=validateInput();
         
        if(!result){
            JOptionPane.showMessageDialog(null, "Please choose a subject","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        try
        {
             if(ExamDAO.isPaperSet(subjectName)==false){
                JOptionPane.showMessageDialog(null, "Sorry! No exam set for "+subjectName,"Subject Not Found!",JOptionPane.ERROR_MESSAGE);
                return;
             }
            
            ArrayList<String> examList=ExamDAO.getExamIdBySubject(UserProfile.getUserName(),subjectName);
             
            if(examList.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "You have given all exam for "+subjectName,"Subject Not Found!",JOptionPane.ERROR_MESSAGE);
                return;
            }
            for(String examId: examList){
                jcbExamId.addItem(examId);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
 

    }//GEN-LAST:event_jcbSubjectActionPerformed

    private void btnTakeTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTakeTestActionPerformed
        int count=jcbSubject.getSelectedIndex();
        if(count==0){
            JOptionPane.showMessageDialog(null, "Please choose a subject","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        count=jcbExamId.getItemCount();
        if(count==0){
            JOptionPane.showMessageDialog(null, "Please select an exam id","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
            
        String subject=jcbSubject.getSelectedItem().toString();
        String examId=jcbExamId.getSelectedItem().toString();
        int ans;
        ans=JOptionPane.showConfirmDialog(null, "You have chosen \""+subject+"\" and \""+examId+"\" paper!\nIs this OK ?","Confirmation!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            
            try{
                int totalQuest=ExamDAO.getQuestionCountByExam(examId.trim());
                System.out.println("Examid:"+examId+" Total quest:"+totalQuest);
               ExamPOJO exam=new ExamPOJO(examId,subject,totalQuest);
                TakeTestFrame testFrame=new TakeTestFrame(exam);
                testFrame.setVisible(true);
                this.dispose();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }

        }

    }//GEN-LAST:event_btnTakeTestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       StudentOptionsFrame option=new StudentOptionsFrame();
       option.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChoosePaperFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChoosePaperFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnTakeTest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox jcbExamId;
    private javax.swing.JComboBox jcbSubject;
    private javax.swing.JLabel lblChooseTheSubject;
    private javax.swing.JLabel lblFillPaperDetails;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblPaperSelectionPanel;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables


public boolean validateInput(){
    int selectedIndex=jcbSubject.getSelectedIndex();
    if(selectedIndex==0)
        return false;
    subjectName=jcbSubject.getSelectedItem().toString();
    return true;
}

}
