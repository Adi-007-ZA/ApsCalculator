/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apscalculator;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author admin
 */
public class CalculateAPSPageWITS extends javax.swing.JFrame {

    /**
     * Creates new form CalculateAPSPage
     */
    public CalculateAPSPageWITS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblS1 = new javax.swing.JLabel();
        lblS2 = new javax.swing.JLabel();
        lblS3 = new javax.swing.JLabel();
        lblMaths = new javax.swing.JLabel();
        lblEnglish = new javax.swing.JLabel();
        lblFal = new javax.swing.JLabel();
        lblLO = new javax.swing.JLabel();
        txfS1 = new javax.swing.JTextField();
        txfS2 = new javax.swing.JTextField();
        txfS3 = new javax.swing.JTextField();
        txfMaths = new javax.swing.JTextField();
        txfEnglish = new javax.swing.JTextField();
        txfLo = new javax.swing.JTextField();
        txfFal = new javax.swing.JTextField();
        lblAP = new javax.swing.JLabel();
        txfAP = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaInstructions = new javax.swing.JTextArea();
        cbPS = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setText("jCheckBox1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Calculate your APS WITS");
        jLabel1.setMaximumSize(new java.awt.Dimension(298, 48));
        jLabel1.setMinimumSize(new java.awt.Dimension(298, 48));
        jLabel1.setPreferredSize(new java.awt.Dimension(298, 48));

        lblS1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblS1.setText("Subject 1:");

        lblS2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblS2.setText("Subject 2:");

        lblS3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblS3.setText("Subject 3:");

        lblMaths.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMaths.setText("Maths:");

        lblEnglish.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEnglish.setText("English:");

        lblFal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFal.setText("FAL:");

        lblLO.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblLO.setText("LO:");

        txfS1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txfS2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txfS3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txfMaths.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txfEnglish.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txfLo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        txfFal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        lblAP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAP.setText("Additional subject:");

        txfAP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        txaInstructions.setEditable(false);
        txaInstructions.setColumns(20);
        txaInstructions.setRows(5);
        txaInstructions.setText("Instructions:\nEnter your 3 best elective marks(%), and if \nyou do physical science (PS) and want it counted\nenter it in subject 1 and check the box.\n\nIf you don't do an advanced program leave \nthat area blank.\n\nNow press calculate\n\nYour score will be displayed in the bottom right");
        txaInstructions.setMaximumSize(new java.awt.Dimension(180, 84));
        txaInstructions.setMinimumSize(new java.awt.Dimension(180, 84));
        txaInstructions.setPreferredSize(new java.awt.Dimension(180, 84));
        jScrollPane2.setViewportView(txaInstructions);

        cbPS.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cbPS.setText("Did Physical Science");
        cbPS.setMaximumSize(new java.awt.Dimension(257, 38));
        cbPS.setMinimumSize(new java.awt.Dimension(257, 38));
        cbPS.setPreferredSize(new java.awt.Dimension(257, 38));
        cbPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPSActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblScore.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblScore.setText("Your score: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblS2)
                    .addComponent(lblS3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(97, 97, 97)
                        .addComponent(lblLO))
                    .addComponent(lblMaths)
                    .addComponent(lblEnglish)
                    .addComponent(lblFal)
                    .addComponent(lblAP)
                    .addComponent(lblS1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txfAP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(txfS1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txfS2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfS3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfMaths, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txfFal, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txfLo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAP)
                    .addComponent(txfAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblS1)
                    .addComponent(txfS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPS, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblS2)
                            .addComponent(txfS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblS3)
                            .addComponent(txfS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaths)
                            .addComponent(txfMaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnglish)
                            .addComponent(txfEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfFal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfLo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLO)
                            .addComponent(btnBack)
                            .addComponent(lblScore))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean isPsDone;
         
    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        Calculate cal = new Calculate();
        DB database = new DB();
        
        cal.setIsWits(true);
        String[] textFields = {txfS1.getText(), txfS2.getText(), txfS3.getText(), 
            txfMaths.getText(), txfEnglish.getText(), txfLo.getText(), 
            txfAP.getText(), txfLo.getText()};//declares and assigns value to the textfield array to be used in the calculate class
        String[] labels = {lblS1.getText(), lblS2.getText(), lblS3.getText(), 
            lblMaths.getText(), lblEnglish.getText(), lblFal.getText(), 
            lblAP.getText(), lblLO.getText()};//declares and assigns value to the label array to be used in the calculate class
        cal.setIsPsDone(isPsDone);
        int score = cal.calculateAPS(textFields, labels);
        
        if (!cal.hasErrors()) {//if there are no errors in the data entered then user is asked if they want to save their score
            lblScore.setText("Your score: " + score);
            int input = JOptionPane.showConfirmDialog(null,
        "Do you want to save this score to your user profile?", 
         "Confirm score save", JOptionPane.YES_NO_OPTION,
         JOptionPane.QUESTION_MESSAGE);
            if (input == 0) {
                try {//saves users score to database
                    database.updateTbl("UPDATE UserResults SET APSwits = " + score 
                            + " WHERE Username = '" + LoginPage.getUserLoggedIn() + "'");//stores user score in access database
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, cal.getError());//shows error message
        }
    }//GEN-LAST:event_btnCalculateActionPerformed
    
    
    private void cbPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPSActionPerformed
        if (cbPS.isSelected() == true) {
            lblS1.setText("PS:");
            isPsDone = true;
        }else{
            lblS1.setText("Subject 1:");
            isPsDone = false;
        } //changes label depending on if physics has been checked or not

    }//GEN-LAST:event_cbPSActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Home h = new Home();
        h.setVisible(true);
        h.setSize(800,550);
        h.setResizable(false);
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
            java.util.logging.Logger.getLogger(CalculateAPSPageWITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateAPSPageWITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateAPSPageWITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateAPSPageWITS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateAPSPageWITS().setVisible(true);
                
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JCheckBox cbPS;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAP;
    private javax.swing.JLabel lblEnglish;
    private javax.swing.JLabel lblFal;
    private javax.swing.JLabel lblLO;
    private javax.swing.JLabel lblMaths;
    private javax.swing.JLabel lblS1;
    private javax.swing.JLabel lblS2;
    private javax.swing.JLabel lblS3;
    private javax.swing.JLabel lblScore;
    private javax.swing.JTextArea txaInstructions;
    private javax.swing.JTextField txfAP;
    private javax.swing.JTextField txfEnglish;
    private javax.swing.JTextField txfFal;
    private javax.swing.JTextField txfLo;
    private javax.swing.JTextField txfMaths;
    private javax.swing.JTextField txfS1;
    private javax.swing.JTextField txfS2;
    private javax.swing.JTextField txfS3;
    // End of variables declaration//GEN-END:variables
}

