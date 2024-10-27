/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package apscalculator;

import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ListOfDegrees extends javax.swing.JFrame {

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgSortUniversity = new javax.swing.ButtonGroup();
        pumFilters = new javax.swing.JPopupMenu();
        mcbSufficientAps = new javax.swing.JCheckBoxMenuItem();
        mcbUniversity = new javax.swing.JCheckBoxMenuItem();
        mcbFaculties = new javax.swing.JCheckBoxMenuItem();
        pumUniversities = new javax.swing.JPopupMenu();
        mcbUct = new javax.swing.JCheckBoxMenuItem();
        mcbUp = new javax.swing.JCheckBoxMenuItem();
        mcbWits = new javax.swing.JCheckBoxMenuItem();
        pumFaculties = new javax.swing.JPopupMenu();
        mcbCommerce = new javax.swing.JCheckBoxMenuItem();
        mcbEngineering = new javax.swing.JCheckBoxMenuItem();
        mcbHealth = new javax.swing.JCheckBoxMenuItem();
        mcbHumanties = new javax.swing.JCheckBoxMenuItem();
        mcbLaw = new javax.swing.JCheckBoxMenuItem();
        mcbScience = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbSort = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnSort = new javax.swing.JButton();
        spnTable = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        rbAscending = new javax.swing.JRadioButton();
        rbDescending = new javax.swing.JRadioButton();
        btnShowFilter = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();

        pumFilters.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mcbSufficientAps.setText("Only degrees within your APS score");
        mcbSufficientAps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbSufficientApsMouseReleased(evt);
            }
        });
        pumFilters.add(mcbSufficientAps);

        mcbUniversity.setText("Universities");
        mcbUniversity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbUniversityMouseReleased(evt);
            }
        });
        pumFilters.add(mcbUniversity);

        mcbFaculties.setText("Filter by Faculty");
        mcbFaculties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbFacultiesMouseReleased(evt);
            }
        });
        pumFilters.add(mcbFaculties);

        pumUniversities.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mcbUct.setSelected(true);
        mcbUct.setText("UCT");
        mcbUct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbUctMouseReleased(evt);
            }
        });
        pumUniversities.add(mcbUct);

        mcbUp.setSelected(true);
        mcbUp.setText("UP");
        mcbUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbUpMouseReleased(evt);
            }
        });
        pumUniversities.add(mcbUp);

        mcbWits.setSelected(true);
        mcbWits.setText("WITS");
        mcbWits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbWitsMouseReleased(evt);
            }
        });
        pumUniversities.add(mcbWits);

        pumFaculties.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mcbCommerce.setSelected(true);
        mcbCommerce.setText("Commerce");
        mcbCommerce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbCommerceMouseReleased(evt);
            }
        });
        pumFaculties.add(mcbCommerce);

        mcbEngineering.setSelected(true);
        mcbEngineering.setText("Engineering");
        mcbEngineering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbEngineeringMouseReleased(evt);
            }
        });
        pumFaculties.add(mcbEngineering);

        mcbHealth.setSelected(true);
        mcbHealth.setText("Health Sciences");
        mcbHealth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbHealthMouseReleased(evt);
            }
        });
        pumFaculties.add(mcbHealth);

        mcbHumanties.setSelected(true);
        mcbHumanties.setText("Humanities");
        mcbHumanties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbHumantiesMouseReleased(evt);
            }
        });
        pumFaculties.add(mcbHumanties);

        mcbLaw.setSelected(true);
        mcbLaw.setText("Law");
        mcbLaw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbLawMouseReleased(evt);
            }
        });
        pumFaculties.add(mcbLaw);

        mcbScience.setSelected(true);
        mcbScience.setText("Science");
        mcbScience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mcbScienceMouseReleased(evt);
            }
        });
        pumFaculties.add(mcbScience);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("List of Degrees");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Sort By:");

        cmbSort.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "University", "Degrees", "Faculty", "APS Requirement" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Filter By:");

        btnSort.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        spnTable.setPreferredSize(new java.awt.Dimension(776, 389));
        spnTable.setRowHeaderView(null);

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Degree", "Faculty", "University", "APS  Requirement"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        spnTable.setViewportView(tblTable);
        if (tblTable.getColumnModel().getColumnCount() > 0) {
            tblTable.getColumnModel().getColumn(1).setMinWidth(194);
            tblTable.getColumnModel().getColumn(1).setPreferredWidth(210);
            tblTable.getColumnModel().getColumn(1).setMaxWidth(220);
            tblTable.getColumnModel().getColumn(2).setMinWidth(100);
            tblTable.getColumnModel().getColumn(2).setPreferredWidth(160);
            tblTable.getColumnModel().getColumn(2).setMaxWidth(194);
            tblTable.getColumnModel().getColumn(3).setMinWidth(100);
            tblTable.getColumnModel().getColumn(3).setPreferredWidth(130);
            tblTable.getColumnModel().getColumn(3).setMaxWidth(194);
        }

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        rbgSortUniversity.add(rbAscending);
        rbAscending.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbAscending.setText("Ascending");

        rbgSortUniversity.add(rbDescending);
        rbDescending.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rbDescending.setSelected(true);
        rbDescending.setText("Descending");

        btnShowFilter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnShowFilter.setText("Show/hide filter options");
        btnShowFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowFilterActionPerformed(evt);
            }
        });

        btnFilter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSort)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbAscending)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbDescending)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFilter)
                            .addComponent(btnShowFilter))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnShowFilter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbAscending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbDescending, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFilter))
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public ListOfDegrees() {
        initComponents();
        fillTable();
    } 
    
    private void fillTable(){
        DegreesManager dm = new DegreesManager();
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        int degrees = dm.getSize();
        String up = "University of Pretoria", uct = "University of Cape Town",
                wits = "University of Witwaterstrand";
        UserArray uArray = new UserArray();
        double[] apsArray = uArray.getApsDetails();//[0] UCT, [1] UP, [2] Wits
        
        if (filterAps) { //detects if user wants to filter by APS
            for (int i = 0; i < degrees; i++) {
                if (dm.getRowDetails(i)[2].equals(uct)) { //rowDetails[2] is university
                    if (Integer.parseInt(dm.getRowDetails(i)[3]) <= apsArray[0]) {//rowDerails[3] is APS requirement
                        model.addRow(dm.getRowDetails(i));
                    }
                } else if(dm.getRowDetails(i)[2].equals(up)){
                    if (Integer.parseInt(dm.getRowDetails(i)[3]) <= apsArray[1]) {
                        model.addRow(dm.getRowDetails(i));
                    }
                }else{
                    if (Integer.parseInt(dm.getRowDetails(i)[3]) <= apsArray[2]) {
                        model.addRow(dm.getRowDetails(i));
                    }
                }
            }
        }else{//normal fill if not filtering by aps
            for (int i = 0; i < degrees; i++) {
                model.addRow(dm.getRowDetails(i));
            }
        }
    }
    
    private void clearTable(){
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        model.setRowCount(0);
    }
    
    private String[] selectRowData(){//determines which degree was selected by mouse click
        int rowNum = tblTable.getSelectedRow();
        String[] row = new String[2];
        row[0] = tblTable.getValueAt(rowNum, 0) + "";//degree name
        row[1] = tblTable.getValueAt(rowNum, 2) + "";//degree university
        return row;
    }
    
    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        if (evt.getClickCount() == 1 && evt.getButton() == MouseEvent.BUTTON1){
            String degreeName = selectRowData()[0];//gets degree name
            String university = selectRowData()[1];//gets degree university
            this.dispose();
            DisplayDegree d = new DisplayDegree(degreeName, university);//calls displayDegree GUI
            d.setVisible(true);
            d.setSize(800, 550);
            d.setResizable(false);
        }
    }//GEN-LAST:event_tblTableMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        Home h = new Home();
        h.setVisible(true);
        h.setSize(800, 550);
        h.setResizable(false);
    }//GEN-LAST:event_btnBackActionPerformed

    /*As a default popup menus hide once something has been selected, in order 
    to change this I would need to create my own popup menu object and then 
    customize it's code to stop it disposing on mouse press. The simpler option
    was to just make listeners for each item in the popup menu that redisplays 
    the popup menu if it is selected. below is the series of listeners for that*/
    private void btnShowFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowFilterActionPerformed
        pumFilters.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_btnShowFilterActionPerformed

    private void mcbSufficientApsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbSufficientApsMouseReleased
        pumFilters.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbSufficientApsMouseReleased

    private void mcbUniversityMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbUniversityMouseReleased
        if (mcbUniversity.isSelected()) {
            pumUniversities.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
        }else{
            pumFilters.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
        }
        
    }//GEN-LAST:event_mcbUniversityMouseReleased

    private void mcbUctMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbUctMouseReleased
        pumUniversities.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbUctMouseReleased

    private void mcbUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbUpMouseReleased
        pumUniversities.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbUpMouseReleased

    private void mcbWitsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbWitsMouseReleased
        pumUniversities.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbWitsMouseReleased

    private void mcbFacultiesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbFacultiesMouseReleased
        if (mcbFaculties.isSelected()) {
            pumFaculties.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
        }else{
            pumFilters.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
        }
    }//GEN-LAST:event_mcbFacultiesMouseReleased

    private void mcbCommerceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbCommerceMouseReleased
        pumFaculties.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbCommerceMouseReleased

    private void mcbEngineeringMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbEngineeringMouseReleased
        pumFaculties.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbEngineeringMouseReleased

    private void mcbHealthMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbHealthMouseReleased
        pumFaculties.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbHealthMouseReleased

    private void mcbLawMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbLawMouseReleased
        pumFaculties.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbLawMouseReleased

    private void mcbHumantiesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbHumantiesMouseReleased
        pumFaculties.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbHumantiesMouseReleased

    private void mcbScienceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mcbScienceMouseReleased
        pumFaculties.show(this, btnShowFilter.getX()+80, btnShowFilter.getY()+75);
    }//GEN-LAST:event_mcbScienceMouseReleased
    //end of poup menu listeners
    
    /*determines what filters are selected in the pop up menu and then stores if
    the filter is selected as a boolean, these are then accessed by the 
    DegreeManager class which uses customized sql queries to filter the data.
    Table is then filled using the newly filtered data*/
    public static boolean filterAps, filterFac, filterUni, filterWits, filterUp, filterUct, filterCom,
            filterEng, filterHealth, filterHuman, filterLaw, filterScience, sortAsc; 
    public static String sortBy = "";
    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        filterAps = mcbSufficientAps.isSelected();
        filterFac = mcbFaculties.isSelected();
        filterUni = mcbUniversity.isSelected();
        filterUct = mcbUct.isSelected();
        filterUp = mcbUp.isSelected();
        filterWits = mcbWits.isSelected();
        filterCom = mcbCommerce.isSelected();
        filterEng = mcbEngineering.isSelected();
        filterHealth = mcbHealth.isSelected();
        filterHuman = mcbHumanties.isSelected();
        filterLaw = mcbLaw.isSelected();
        filterScience = mcbScience.isSelected();
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        clearTable();
        fillTable();
    }//GEN-LAST:event_btnFilterActionPerformed

    /*Stores what Sort is being used which is then used by the DegreeManager 
    class which uses customized sql queries to Sort the data. Table is then 
    filled using newly sorted data*/
    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        sortBy = cmbSort.getSelectedItem()+ "";
        sortAsc = rbAscending.isSelected();
        DefaultTableModel model = (DefaultTableModel) tblTable.getModel();
        clearTable();
        fillTable();
    }//GEN-LAST:event_btnSortActionPerformed

    
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
            java.util.logging.Logger.getLogger(ListOfDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfDegrees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfDegrees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnShowFilter;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cmbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JCheckBoxMenuItem mcbCommerce;
    private javax.swing.JCheckBoxMenuItem mcbEngineering;
    private javax.swing.JCheckBoxMenuItem mcbFaculties;
    private javax.swing.JCheckBoxMenuItem mcbHealth;
    private javax.swing.JCheckBoxMenuItem mcbHumanties;
    private javax.swing.JCheckBoxMenuItem mcbLaw;
    private javax.swing.JCheckBoxMenuItem mcbScience;
    private javax.swing.JCheckBoxMenuItem mcbSufficientAps;
    private javax.swing.JCheckBoxMenuItem mcbUct;
    private javax.swing.JCheckBoxMenuItem mcbUniversity;
    private javax.swing.JCheckBoxMenuItem mcbUp;
    private javax.swing.JCheckBoxMenuItem mcbWits;
    private javax.swing.JPopupMenu pumFaculties;
    private javax.swing.JPopupMenu pumFilters;
    private javax.swing.JPopupMenu pumUniversities;
    private javax.swing.JRadioButton rbAscending;
    private javax.swing.JRadioButton rbDescending;
    private javax.swing.ButtonGroup rbgSortUniversity;
    private javax.swing.JScrollPane spnTable;
    private javax.swing.JTable tblTable;
    // End of variables declaration//GEN-END:variables
}
