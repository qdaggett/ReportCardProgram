/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//test

//blah
package reportcardprogram;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author salat5228
 */
public class ReportCardProgram extends javax.swing.JFrame {

    /**
     * Creates new form ReportCardProgram
     */
    public ReportCardProgram() {
        initComponents();
    }
public static int i = 0;
public static int f = 0;
public static int RowID[] = new int[99];
public static    int StudentAverageA[] = new int[99];
public static    int StudentAverageB[] = new int[99];
public static    int StudentAverageC[] = new int[99];
public static    int StudentAverageD[] = new int[99];
public static    String StudentFirstName[] = new String[99];
public static    String StudentLastName[] = new String[99];
public static    int StudentNumber[] = new int[99];
public static    String StudentSubjectA[] = new String[99];
public static    String StudentSubjectB[] = new String[99];
public static   String StudentSubjectC[] = new String[99];
public static   String StudentSubjectD[] = new String[99];
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInfo = new javax.swing.JTable();
        btnAddStudent = new javax.swing.JButton();
        btnModStudent = new javax.swing.JButton();
        btnDelStudent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        Title.setPreferredSize(new java.awt.Dimension(38, 72));
        Title.setText("Report Card Pro");

        tblInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Row #", "Last", "First", "Average", "Subject A", "Subject B", "Subject C", "Subject D"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInfo);
        tblInfo.getColumnModel().getColumn(1).setResizable(false);
        tblInfo.getColumnModel().getColumn(2).setResizable(false);
        tblInfo.getColumnModel().getColumn(3).setResizable(false);
        tblInfo.getColumnModel().getColumn(4).setResizable(false);
        tblInfo.getColumnModel().getColumn(5).setResizable(false);
        tblInfo.getColumnModel().getColumn(6).setResizable(false);
        tblInfo.getColumnModel().getColumn(7).setResizable(false);

        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        btnModStudent.setText("Remove Student");
        btnModStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModStudentActionPerformed(evt);
            }
        });

        btnDelStudent.setText("Modify Student");
        btnDelStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnModStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddStudent)
                    .addComponent(btnModStudent)
                    .addComponent(btnDelStudent))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        AddStudent s = new AddStudent();
        s.setVisible(true);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnModStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModStudentActionPerformed
        if(tblInfo.getSelectedRow() > -1){
        int selected = tblInfo.getSelectedRow();
        ((DefaultTableModel)tblInfo.getModel()).removeRow(selected);
        }
        else{
            new RemoveStudent().setVisible(true);
        }
    }//GEN-LAST:event_btnModStudentActionPerformed

    private void btnDelStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelStudentActionPerformed
        
        if(tblInfo.getSelectedRow() > -1){
        int selected = tblInfo.getSelectedRow();
        int selected2 = tblInfo.getSelectedColumn();
        ModifyStudent m = new ModifyStudent();
        m.setVisible(true);
        Object SelectedRowNumber = (Object) tblInfo.getModel().getValueAt(selected, selected2);
        int L = (Integer) SelectedRowNumber;
        String newStudentNumber = StudentNumber[L] + " ";
        String newAverageA = StudentAverageA[L]+ " ";
        String newAverageB = StudentAverageB[L]+ " ";
        String newAverageC = StudentAverageC[L]+ " ";
        String newAverageD = StudentAverageD[L]+ " ";
        m.txtFName.setText(StudentFirstName[L]);
        m.txtLName.setText(StudentLastName[L]);
        m.txtNumber.setText(newStudentNumber);
        m.txtSubjectA.setText(StudentSubjectA[L]);
        m.txtSubjectB.setText(StudentSubjectB[L]);
        m.txtSubjectC.setText(StudentSubjectC[L]);
        m.txtSubjectD.setText(StudentSubjectD[L]);
        m.txtAvgA.setText(newAverageA);
        m.txtAvgB.setText(newAverageB);
        m.txtAvgC.setText(newAverageC);
        m.txtAvgD.setText(newAverageD);
        ((DefaultTableModel)tblInfo.getModel()).removeRow(selected);
        }
        else{
            new RemoveStudent().setVisible(true);
        }
    }//GEN-LAST:event_btnDelStudentActionPerformed

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
            java.util.logging.Logger.getLogger(ReportCardProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportCardProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportCardProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportCardProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportCardProgram().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Title;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnDelStudent;
    private javax.swing.JButton btnModStudent;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblInfo;
    // End of variables declaration//GEN-END:variables
}
