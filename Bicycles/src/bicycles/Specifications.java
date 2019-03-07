/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;

//import javafx.scene.control.RadioButton;

/**
 *
 * @author karan
 */
public class Specifications extends javax.swing.JFrame {
    static boolean geared =false;
    static int cost=0;
    static String gearType;
    static String bikeType;
//public boolean geared =false;
    public boolean geared(){ 
        return geared;    }
    public String geartype(){
        return gearType;}
    public String biketype(){
        return bikeType;}
    
    /**
     * Creates new form Specifications
     */
    public Specifications() {
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

        GearNotGearGroup = new javax.swing.ButtonGroup();
        TrainingWheelWOTW = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        notGeared = new javax.swing.JRadioButton();
        Geared = new javax.swing.JRadioButton();
        cbxGear = new javax.swing.JComboBox<>();
        cbxBikeType = new javax.swing.JComboBox<>();
        listSells = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFieldPrice = new javax.swing.JTextField();
        txtFieldBuyer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GearNotGearGroup.add(notGeared);
        notGeared.setText("Non Geared");
        notGeared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notGearedActionPerformed(evt);
            }
        });

        GearNotGearGroup.add(Geared);
        Geared.setText("Geared");
        Geared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GearedActionPerformed(evt);
            }
        });

        cbxGear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Back Only", "Front and Back" }));
        cbxGear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGearActionPerformed(evt);
            }
        });

        cbxBikeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mountain", "Street" }));
        cbxBikeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBikeTypeActionPerformed(evt);
            }
        });

        listSells.setText("List Sells");
        listSells.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSellsActionPerformed(evt);
            }
        });

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TeXGyrePagella", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 161, 187));
        jLabel1.setText("Pick your Bicycle Up!");

        jLabel2.setText("Choose Gears");

        txtFieldPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPriceActionPerformed(evt);
            }
        });

        txtFieldBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldBuyerActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Price:");

        jLabel4.setText("Sold to:");

        button1.setLabel("button1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(cbxGear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxBikeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Geared))
                        .addGap(84, 84, 84)
                        .addComponent(notGeared)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFieldBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addComponent(listSells, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Geared)
                            .addComponent(notGeared))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxGear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxBikeType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFieldBuyer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(listSells)
                                .addComponent(Close))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldBuyerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldBuyerActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseActionPerformed

    private void cbxGearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGearActionPerformed
           // TODO add your handling code here:
           gearType=cbxGear.getSelectedItem().toString();
           
    }//GEN-LAST:event_cbxGearActionPerformed

    private void GearedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GearedActionPerformed
        // TODO add your handling code here:
        if(Geared.isSelected()){
            geared=true;
            jLabel2.setVisible(true);
            cbxGear.setVisible(true);
        }
    }//GEN-LAST:event_GearedActionPerformed

    private void cbxBikeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBikeTypeActionPerformed
        // TODO add your handling code here:
        bikeType=cbxBikeType.getSelectedItem().toString();
    }//GEN-LAST:event_cbxBikeTypeActionPerformed

    private void notGearedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notGearedActionPerformed
        // TODO add your handling code here:
        if(notGeared.isSelected()){
            geared=false;
            jLabel2.setVisible(false);
            cbxGear.setVisible(false);
        }
    }//GEN-LAST:event_notGearedActionPerformed

    private void txtFieldPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPriceActionPerformed

    private void listSellsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSellsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listSellsActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        
        bikeType=cbxBikeType.getSelectedItem().toString();
        gearType=cbxGear.getSelectedItem().toString();
        
        bike basicbike;
        basicbike = new type(new gears(new Basic()));
        System.out.println("PRICE:" + basicbike.getCost());
        cost=basicbike.getCost();
        txtFieldPrice.setText(Integer.toString(cost)); 
    }//GEN-LAST:event_button1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Specifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Specifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Specifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Specifications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Specifications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.ButtonGroup GearNotGearGroup;
    private javax.swing.JRadioButton Geared;
    private javax.swing.ButtonGroup TrainingWheelWOTW;
    private java.awt.Button button1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxBikeType;
    private javax.swing.JComboBox<String> cbxGear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton listSells;
    private javax.swing.JRadioButton notGeared;
    private javax.swing.JTextField txtFieldBuyer;
    private javax.swing.JTextField txtFieldPrice;
    // End of variables declaration//GEN-END:variables
}
