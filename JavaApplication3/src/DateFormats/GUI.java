/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DateFormats;


import javax.swing.JOptionPane;
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
        this.setLocationRelativeTo(this);
        cbShortDate.setSelected(true);
        rootPane.setDefaultButton(btnSubmit);
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

        txtDay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDayKeyTyped(evt);
            }
        });

        lblMonth.setText("Month:");

        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });
        txtMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonthKeyTyped(evt);
            }
        });

        lblYear.setText("Year:");

        txtYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYearKeyTyped(evt);
            }
        });

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
        cbShortDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShortDateActionPerformed(evt);
            }
        });

        cbLongDate.setText("Long Date");
        cbLongDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLongDateActionPerformed(evt);
            }
        });

        lblShortDate.setText("Short Date: ");

        lblLongDate.setText("Long Date:");

        cbxShortDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "dd/MM/yy", "MM-dd-yy", " " }));
        cbxShortDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxShortDateActionPerformed(evt);
            }
        });

        cbxLongDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MMMM dd,yyyy", "dd,yyyy MMMM" }));
        cbxLongDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLongDateActionPerformed(evt);
            }
        });
        cbxLongDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxLongDateKeyPressed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        btnSubmit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSubmitKeyPressed(evt);
            }
        });

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
        // TODO add your handling code here
   
    }//GEN-LAST:event_txtMonthActionPerformed

    private void cbxLongDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLongDateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbxLongDateActionPerformed

    private void cbxShortDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxShortDateActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cbxShortDateActionPerformed

    private void cbShortDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShortDateActionPerformed
        // TODO add your handling code here:
        if(cbShortDate.isSelected()){
        cbxShortDate.setEnabled(true);}
        else{
cbxShortDate.setEnabled(false);
        }
    }//GEN-LAST:event_cbShortDateActionPerformed

    private void cbxLongDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxLongDateKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cbxLongDateKeyPressed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         int val = Integer.parseInt(txtDay.getText()); 
if ( (val > 31)||(val<1)){ 
JOptionPane.showMessageDialog(this,"Please enter a day between 1 and 31","Warning",JOptionPane.INFORMATION_MESSAGE);}
       
         int num = Integer.parseInt(txtMonth.getText()); 
if ( (num > 12)||(num<1)){
JOptionPane.showMessageDialog(this,"Please enter a month between 1 and 12","Warning",JOptionPane.INFORMATION_MESSAGE);}
        
              int yr = Integer.parseInt(txtYear.getText()); 
if ( (yr > 2100)||(yr<1900)){
    JOptionPane.showMessageDialog(this,"Please enter a year between 1900 and 2100","Warning",JOptionPane.INFORMATION_MESSAGE);}
    
if((!(cbShortDate.isSelected()))&& (!(cbLongDate.isSelected()))){
    JOptionPane.showMessageDialog(this, "Please choose a type","Warning",JOptionPane.INFORMATION_MESSAGE);
}


        
        if(txtDay.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a day","Warning",JOptionPane.INFORMATION_MESSAGE);}
        
        else if(txtMonth.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a month","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(txtYear.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a year","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String day=txtDay.getText();
            String month=txtMonth.getText();
            String year=txtYear.getText();
            
        boolean type= cbShortDate.isSelected();
           
        
           String shortDate = 
                    
                            cbxShortDate.toString();
           String longDate = 
                    
                            cbxLongDate.toString();
        
            DateFormats d = 
                new DateFormats(day,month,year,type,shortDate,longDate);
        txtShortDate.setText(d.getShortD());
        txtLongDate.setText(d.getLongD());
        }
        
        
    }//GEN-LAST:event_btnSubmitActionPerformed

     
        
    private void txtMonthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonthKeyTyped
        // TODO add your handling code here:
            if(txtMonth.getText().length()>=2){
evt.consume();
}
    }//GEN-LAST:event_txtMonthKeyTyped

    private void txtDayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDayKeyTyped
        // TODO add your handling code here:
            if(txtDay.getText().length()>=2){
evt.consume();
}
    }//GEN-LAST:event_txtDayKeyTyped

    private void txtYearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYearKeyTyped
        // TODO add your handling code here:
            if(txtYear.getText().length()>=4){
evt.consume();
}
    }//GEN-LAST:event_txtYearKeyTyped

    private void btnSubmitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSubmitKeyPressed
        // TODO add your handling code here:
        if(txtDay.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a day","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txtMonth.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a month","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(txtYear.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter a year","Warning",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitKeyPressed

    private void cbLongDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLongDateActionPerformed
        // TODO add your handling code here:
        if(cbLongDate.isSelected()){
        cbxLongDate.setEnabled(true);}
        else{
cbxLongDate.setEnabled(false);
        }
    }//GEN-LAST:event_cbLongDateActionPerformed

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
