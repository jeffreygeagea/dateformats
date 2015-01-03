/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DateFormats;

/**
 *
 * @author hp
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        pnlDate = new javax.swing.JPanel();
        lblDay = new javax.swing.JLabel();
        txtDay = new javax.swing.JTextField();
        lblMonth = new javax.swing.JLabel();
        txtMonth = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        pnlFormats = new javax.swing.JPanel();
        lblType = new javax.swing.JLabel();
        cbShortDate = new javax.swing.JCheckBox();
        cbLongDate = new javax.swing.JCheckBox();
        lblShortDate = new javax.swing.JLabel();
        lblLongDate = new javax.swing.JLabel();
        cbxShortDate = new javax.swing.JComboBox();
        cbxLongDate = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        pnlDisplays = new javax.swing.JPanel();
        lblShortDate1 = new javax.swing.JLabel();
        lblLongDate1 = new javax.swing.JLabel();
        txtShortDate = new javax.swing.JTextField();
        txtLongDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Date formats");

        pnlDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));

        lblDay.setText("Day:");

        lblMonth.setText("Month:");

        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });

        lblYear.setText("Year:");

        javax.swing.GroupLayout pnlDateLayout = new javax.swing.GroupLayout(pnlDate);
        pnlDate.setLayout(pnlDateLayout);
        pnlDateLayout.setHorizontalGroup(
            pnlDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblMonth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lblYear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlDateLayout.setVerticalGroup(
            pnlDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDateLayout.createSequentialGroup()
                .addGroup(pnlDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDay)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonth)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pnlFormats.setBorder(javax.swing.BorderFactory.createTitledBorder("Formats"));

        lblType.setText("Type:");

        cbShortDate.setText("Short Date");

        cbLongDate.setText("Long Date");

        lblShortDate.setText("Short Date: ");

        lblLongDate.setText("Long Date:");

        cbxShortDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dd/MM/yy", "MM-dd-yy", "yy.MM.dd", "dd,yy,MM" }));

        cbxLongDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MMMM dd,yyyy", "dd,yyyy MMMM", "yyyy,dd MMMM" }));

        btnSubmit.setText("Submit");

        javax.swing.GroupLayout pnlFormatsLayout = new javax.swing.GroupLayout(pnlFormats);
        pnlFormats.setLayout(pnlFormatsLayout);
        pnlFormatsLayout.setHorizontalGroup(
            pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSubmit)
                    .addGroup(pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFormatsLayout.createSequentialGroup()
                            .addComponent(lblType)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbShortDate)
                            .addGap(18, 18, 18)
                            .addComponent(cbLongDate))
                        .addGroup(pnlFormatsLayout.createSequentialGroup()
                            .addGroup(pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblShortDate)
                                .addComponent(lblLongDate))
                            .addGap(35, 35, 35)
                            .addGroup(pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxLongDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxShortDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFormatsLayout.setVerticalGroup(
            pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormatsLayout.createSequentialGroup()
                .addGroup(pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFormatsLayout.createSequentialGroup()
                        .addGroup(pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblType)
                            .addComponent(cbShortDate)
                            .addComponent(cbLongDate))
                        .addGap(18, 18, 18)
                        .addComponent(lblShortDate))
                    .addComponent(cbxShortDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLongDate)
                    .addComponent(cbxLongDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap())
        );

        pnlDisplays.setBorder(javax.swing.BorderFactory.createTitledBorder("Displays"));

        lblShortDate1.setText("Short Date :");

        lblLongDate1.setText("Long Date:");

        txtShortDate.setEditable(false);

        txtLongDate.setEditable(false);

        javax.swing.GroupLayout pnlDisplaysLayout = new javax.swing.GroupLayout(pnlDisplays);
        pnlDisplays.setLayout(pnlDisplaysLayout);
        pnlDisplaysLayout.setHorizontalGroup(
            pnlDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplaysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDisplaysLayout.createSequentialGroup()
                        .addComponent(lblShortDate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtShortDate))
                    .addGroup(pnlDisplaysLayout.createSequentialGroup()
                        .addComponent(lblLongDate1)
                        .addGap(18, 18, 18)
                        .addComponent(txtLongDate)))
                .addContainerGap())
        );
        pnlDisplaysLayout.setVerticalGroup(
            pnlDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplaysLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblShortDate1)
                    .addComponent(txtShortDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(pnlDisplaysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLongDate1)
                    .addComponent(txtLongDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFormats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDisplays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlFormats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDisplays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbLongDate;
    private javax.swing.JCheckBox cbShortDate;
    private javax.swing.JComboBox cbxLongDate;
    private javax.swing.JComboBox cbxShortDate;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblLongDate;
    private javax.swing.JLabel lblLongDate1;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblShortDate;
    private javax.swing.JLabel lblShortDate1;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblYear;
    private javax.swing.JPanel pnlDate;
    private javax.swing.JPanel pnlDisplays;
    private javax.swing.JPanel pnlFormats;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtLongDate;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtShortDate;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}