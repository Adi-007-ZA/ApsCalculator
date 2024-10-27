/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apscalculator;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class CalculateAPSPage extends javax.swing.JFrame {

    /**
     * Creates new form CalculateAPSPage
     */
    public CalculateAPSPage() {
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
        cmbUnis = new javax.swing.JComboBox<>();
        btnConfirmUni = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaInstructions = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setText("jCheckBox1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Calculate your APS");
        jLabel1.setMaximumSize(new java.awt.Dimension(298, 48));
        jLabel1.setMinimumSize(new java.awt.Dimension(298, 48));
        jLabel1.setPreferredSize(new java.awt.Dimension(298, 48));

        cmbUnis.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cmbUnis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WITS", "UCT", "TUKS/UP" }));

        btnConfirmUni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirmUni.setText("Confirm UNI");
        btnConfirmUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmUniActionPerformed(evt);
            }
        });

        txaInstructions.setEditable(false);
        txaInstructions.setColumns(20);
        txaInstructions.setRows(5);
        txaInstructions.setText("Instructions:\nSelect the university you want to calculate \nyour APS for and press confirm UNI.");
        txaInstructions.setMaximumSize(new java.awt.Dimension(180, 84));
        txaInstructions.setMinimumSize(new java.awt.Dimension(180, 84));
        txaInstructions.setPreferredSize(new java.awt.Dimension(180, 84));
        jScrollPane2.setViewportView(txaInstructions);

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbUnis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(btnConfirmUni, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbUnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnConfirmUni, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnConfirmUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmUniActionPerformed
        //determines which university the user has selected and displays the appropriate aps calculator for each
        String Uni = cmbUnis.getSelectedItem() + "";
        
        if (Uni.equals("WITS")) {
            this.dispose();
            CalculateAPSPageWITS cal =  new CalculateAPSPageWITS();
            cal.setSize(800, 550);
            cal.setResizable(false);
            cal.setVisible(true);
        }else if (Uni.equals("UCT")) {
            this.dispose();
            CalculateAPSPageUCT cal =  new CalculateAPSPageUCT();
            cal.setSize(800, 550);
            cal.setResizable(false);
            cal.setVisible(true);
        }else if (Uni.equals("TUKS/UP")){
            this.dispose();
            CalculateAPSPageUP cal = new CalculateAPSPageUP();
            cal.setSize(800, 550);
            cal.setResizable(false);
            cal.setVisible(true);
        }
    }//GEN-LAST:event_btnConfirmUniActionPerformed

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
            java.util.logging.Logger.getLogger(CalculateAPSPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateAPSPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateAPSPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateAPSPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateAPSPage().setVisible(true);
                
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirmUni;
    private javax.swing.JComboBox<String> cmbUnis;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txaInstructions;
    // End of variables declaration//GEN-END:variables
}

