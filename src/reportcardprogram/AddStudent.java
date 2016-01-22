/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reportcardprogram;

/**
 *
 * @author salat5228
 */
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AddStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddStudent
     */
    public AddStudent() {
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

        lblTitle = new java.awt.Label();
        txtFName = new javax.swing.JTextField();
        lblLName = new java.awt.Label();
        txtLName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        lblFName = new java.awt.Label();
        lblTotalAvg = new java.awt.Label();
        lblAvg = new java.awt.Label();
        txtSubjectA = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JToggleButton();
        lblNumber = new java.awt.Label();
        lblSubject = new java.awt.Label();
        txtTotalAvg = new javax.swing.JTextField();
        txtSubjectC = new javax.swing.JTextField();
        txtSubjectB = new javax.swing.JTextField();
        txtSubjectD = new javax.swing.JTextField();
        txtAvgA = new javax.swing.JTextField();
        txtAvgC = new javax.swing.JTextField();
        txtAvgB = new javax.swing.JTextField();
        txtAvgD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        lblTitle.setPreferredSize(new java.awt.Dimension(38, 72));
        lblTitle.setText("Add Student");

        txtFName.setBackground(new java.awt.Color(204, 204, 204));
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        lblLName.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblLName.setPreferredSize(new java.awt.Dimension(38, 72));
        lblLName.setText("Last Name");

        txtLName.setBackground(new java.awt.Color(204, 204, 204));
        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        txtNumber.setBackground(new java.awt.Color(204, 204, 204));
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        lblFName.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblFName.setPreferredSize(new java.awt.Dimension(38, 72));
        lblFName.setText("First Name");

        lblTotalAvg.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblTotalAvg.setPreferredSize(new java.awt.Dimension(38, 72));
        lblTotalAvg.setText("Total Average:");

        lblAvg.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblAvg.setPreferredSize(new java.awt.Dimension(38, 72));
        lblAvg.setText("Average");

        txtSubjectA.setBackground(new java.awt.Color(204, 204, 204));
        txtSubjectA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectAActionPerformed(evt);
            }
        });

        btnConfirm.setText("Input Student");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblNumber.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        lblNumber.setPreferredSize(new java.awt.Dimension(38, 72));
        lblNumber.setText("Number");

        lblSubject.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lblSubject.setPreferredSize(new java.awt.Dimension(38, 72));
        lblSubject.setText("Subject");

        txtTotalAvg.setEditable(false);
        txtTotalAvg.setBackground(new java.awt.Color(204, 204, 204));
        txtTotalAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAvgActionPerformed(evt);
            }
        });

        txtSubjectC.setBackground(new java.awt.Color(204, 204, 204));
        txtSubjectC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectCActionPerformed(evt);
            }
        });

        txtSubjectB.setBackground(new java.awt.Color(204, 204, 204));
        txtSubjectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectBActionPerformed(evt);
            }
        });

        txtSubjectD.setBackground(new java.awt.Color(204, 204, 204));
        txtSubjectD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubjectDActionPerformed(evt);
            }
        });

        txtAvgA.setBackground(new java.awt.Color(204, 204, 204));
        txtAvgA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvgAActionPerformed(evt);
            }
        });

        txtAvgC.setBackground(new java.awt.Color(204, 204, 204));
        txtAvgC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvgCActionPerformed(evt);
            }
        });

        txtAvgB.setBackground(new java.awt.Color(204, 204, 204));
        txtAvgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvgBActionPerformed(evt);
            }
        });

        txtAvgD.setBackground(new java.awt.Color(204, 204, 204));
        txtAvgD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvgDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotalAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtTotalAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtAvgA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSubjectA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSubjectB, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtAvgB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtAvgC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSubjectC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtAvgD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSubjectD, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSubjectA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubjectB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubjectC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSubjectD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAvgA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAvgB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAvgC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAvgD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnConfirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtSubjectAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectAActionPerformed

    }//GEN-LAST:event_txtSubjectAActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
 ReportCardProgram.i = ReportCardProgram.i+1;
        int average;
    int subjectAverageA = Integer.parseInt(txtAvgA.getText());
    int subjectAverageB = Integer.parseInt(txtAvgB.getText());
    int subjectAverageC = Integer.parseInt(txtAvgC.getText());
    int subjectAverageD = Integer.parseInt(txtAvgD.getText());
    int studentNumberInteger = Integer.parseInt(txtNumber.getText());
    average = (subjectAverageA+subjectAverageB+subjectAverageC+subjectAverageD)/4;
    String newAvg = average+" ";
    txtTotalAvg.setText(newAvg);
        DefaultTableModel model = (DefaultTableModel) ReportCardProgram.tblInfo.getModel();
    model.addRow(new Object[]{ReportCardProgram.i,txtLName.getText(), txtFName.getText(), txtTotalAvg.getText(), txtSubjectA.getText() + ": " + txtAvgA.getText(),
    txtSubjectB.getText() + ": " + txtAvgB.getText(),
    txtSubjectC.getText() + ": " + txtAvgC.getText(),
            txtSubjectD.getText() + ": " + txtAvgD.getText()});
    
    File outFile = new File(txtFName.getText()+".txt");
        try {
            PrintStream out = new PrintStream(outFile);
            out.println(txtFName.getText());
            out.println(txtLName.getText());
            out.println(txtTotalAvg.getText());
            out.println(txtSubjectA.getText());
            out.println(txtAvgA.getText());
            out.println(txtSubjectB.getText());
            out.println(txtAvgB.getText());
            out.println(txtSubjectC.getText());
            out.println(txtAvgC.getText());
            out.println(txtSubjectD.getText());
            out.println(txtAvgD.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    // new Arrays for Students
    
   ReportCardProgram.RowID[ReportCardProgram.i]=ReportCardProgram.i;
   ReportCardProgram.StudentAverageA[ReportCardProgram.i]=subjectAverageA;
   ReportCardProgram.StudentAverageB[ReportCardProgram.i]=subjectAverageB;
   ReportCardProgram.StudentAverageC[ReportCardProgram.i]=subjectAverageC;
   ReportCardProgram.StudentAverageD[ReportCardProgram.i]=subjectAverageD;
     ReportCardProgram.StudentNumber[ReportCardProgram.i]=studentNumberInteger;
   ReportCardProgram.StudentFirstName[ReportCardProgram.i]=txtFName.getText();
   ReportCardProgram.StudentLastName[ReportCardProgram.i]=txtLName.getText();
   ReportCardProgram.StudentSubjectA[ReportCardProgram.i]=txtSubjectA.getText();
   ReportCardProgram.StudentSubjectB[ReportCardProgram.i]=txtSubjectB.getText();
   ReportCardProgram.StudentSubjectC[ReportCardProgram.i]=txtSubjectC.getText();
   ReportCardProgram.StudentSubjectD[ReportCardProgram.i]=txtSubjectD.getText();
   ReportCardProgram.StudentTotalAvg[ReportCardProgram.i]=txtTotalAvg.getText();
   
    
    
    this.dispose();

        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtTotalAvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAvgActionPerformed
    
    }//GEN-LAST:event_txtTotalAvgActionPerformed

    private void txtSubjectCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectCActionPerformed

    private void txtSubjectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectBActionPerformed

    private void txtSubjectDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubjectDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubjectDActionPerformed

    private void txtAvgAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvgAActionPerformed

    }//GEN-LAST:event_txtAvgAActionPerformed

    private void txtAvgCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvgCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvgCActionPerformed

    private void txtAvgBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvgBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvgBActionPerformed

    private void txtAvgDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvgDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvgDActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
    NumberFormat format = NumberFormat.getInstance();
    NumberFormatter formatter = new NumberFormatter(format);
    formatter.setValueClass(Integer.class);
    formatter.setMinimum(0);
    formatter.setMaximum(Integer.MAX_VALUE);
    // If you want the value to be committed on each keystroke instead of focus lost
    formatter.setCommitsOnValidEdit(true);
    JFormattedTextField field = new JFormattedTextField(formatter);

    JOptionPane.showMessageDialog(null, field);

    // getValue() always returns something valid
    System.out.println(field.getValue());
    
    

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnConfirm;
    private java.awt.Label lblAvg;
    private java.awt.Label lblFName;
    private java.awt.Label lblLName;
    private java.awt.Label lblNumber;
    private java.awt.Label lblSubject;
    private java.awt.Label lblTitle;
    private java.awt.Label lblTotalAvg;
    public static javax.swing.JTextField txtAvgA;
    public static javax.swing.JTextField txtAvgB;
    public static javax.swing.JTextField txtAvgC;
    public static javax.swing.JTextField txtAvgD;
    public static javax.swing.JTextField txtFName;
    public static javax.swing.JTextField txtLName;
    public static javax.swing.JTextField txtNumber;
    public static javax.swing.JTextField txtSubjectA;
    public static javax.swing.JTextField txtSubjectB;
    public static javax.swing.JTextField txtSubjectC;
    public static javax.swing.JTextField txtSubjectD;
    public static javax.swing.JTextField txtTotalAvg;
    // End of variables declaration//GEN-END:variables
}
