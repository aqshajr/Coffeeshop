package View.User;

import Controller.ControllerMenu;
import Controller.ControllerRiwayat;
import Model.Riwayat.ModelRiwayat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ViewHalamanOrder extends javax.swing.JFrame {
    
    ControllerRiwayat controller;
    ControllerMenu controller1;
    
    Integer baris;

    public ViewHalamanOrder() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);

        ModelRiwayat pesan = new ModelRiwayat();
        
        controller1 = new ControllerMenu(this);
        controller = new ControllerRiwayat(this);
        controller1.showAllMenuNA();

        TabelDataMenu.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
                baris = TabelDataMenu.getSelectedRow();
        }    
    });
                
        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewHalamanUtama().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupHotIce = new javax.swing.ButtonGroup();
        groupSize = new javax.swing.ButtonGroup();
        groupSweetness = new javax.swing.ButtonGroup();
        groupDairy = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        labelInputYourOrder = new javax.swing.JLabel();
        labelNotes = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        rbIce = new javax.swing.JRadioButton();
        rbAlmond = new javax.swing.JRadioButton();
        labelHotIce = new javax.swing.JLabel();
        rbHot = new javax.swing.JRadioButton();
        rbCow = new javax.swing.JRadioButton();
        labelSize = new javax.swing.JLabel();
        rbRegular = new javax.swing.JRadioButton();
        rbLarge = new javax.swing.JRadioButton();
        labelSweetness = new javax.swing.JLabel();
        rbNormal = new javax.swing.JRadioButton();
        rbLess = new javax.swing.JRadioButton();
        rbOat = new javax.swing.JRadioButton();
        labelDairy = new javax.swing.JLabel();
        labelTopping = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputNotes = new javax.swing.JTextArea();
        tombolPesan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelDataMenu = new javax.swing.JTable();
        inputNama = new javax.swing.JTextField();
        rbCaramelSauce = new javax.swing.JRadioButton();
        rbCaramelCrumble = new javax.swing.JRadioButton();
        rbChocoGranola = new javax.swing.JRadioButton();
        rbSeaSalt = new javax.swing.JRadioButton();
        tombolKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelInputYourOrder.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelInputYourOrder.setText("Input your Order");
        getContentPane().add(labelInputYourOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 250, -1));

        labelNotes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelNotes.setText("Notes");
        getContentPane().add(labelNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 110, 16));

        labelNama.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelNama.setText("Nama");
        getContentPane().add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 37, -1));

        groupHotIce.add(rbIce);
        rbIce.setText("Ice");
        rbIce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIceActionPerformed(evt);
            }
        });
        getContentPane().add(rbIce, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 98, -1));

        groupDairy.add(rbAlmond);
        rbAlmond.setText("Almond Milk");
        rbAlmond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlmondActionPerformed(evt);
            }
        });
        getContentPane().add(rbAlmond, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 110, -1));

        labelHotIce.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelHotIce.setText("Hot/Ice");
        getContentPane().add(labelHotIce, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 16));

        groupHotIce.add(rbHot);
        rbHot.setSelected(true);
        rbHot.setText("Hot");
        rbHot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbHotActionPerformed(evt);
            }
        });
        getContentPane().add(rbHot, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        groupDairy.add(rbCow);
        rbCow.setText("Cow Milk");
        rbCow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCowActionPerformed(evt);
            }
        });
        getContentPane().add(rbCow, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 110, 20));

        labelSize.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSize.setText("Size");
        getContentPane().add(labelSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, 16));

        groupSize.add(rbRegular);
        rbRegular.setSelected(true);
        rbRegular.setText("Regular");
        rbRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegularActionPerformed(evt);
            }
        });
        getContentPane().add(rbRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, 20));

        groupSize.add(rbLarge);
        rbLarge.setText("Large");
        rbLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLargeActionPerformed(evt);
            }
        });
        getContentPane().add(rbLarge, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 70, -1));

        labelSweetness.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSweetness.setText("Sweetness Level");
        getContentPane().add(labelSweetness, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 110, 16));

        groupSweetness.add(rbNormal);
        rbNormal.setSelected(true);
        rbNormal.setText("Normal Sweet");
        rbNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNormalActionPerformed(evt);
            }
        });
        getContentPane().add(rbNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 110, 20));

        groupSweetness.add(rbLess);
        rbLess.setText("Less Sweet");
        rbLess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLessActionPerformed(evt);
            }
        });
        getContentPane().add(rbLess, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, -1));

        groupDairy.add(rbOat);
        rbOat.setText("Oat Milk");
        rbOat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOatActionPerformed(evt);
            }
        });
        getContentPane().add(rbOat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, -1));

        labelDairy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelDairy.setText("Dairy");
        labelDairy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelDairyMouseClicked(evt);
            }
        });
        getContentPane().add(labelDairy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 16));

        labelTopping.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelTopping.setText("Topping");
        getContentPane().add(labelTopping, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, 16));

        inputNotes.setColumns(20);
        inputNotes.setRows(5);
        jScrollPane1.setViewportView(inputNotes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 330, 50));

        tombolPesan.setText("Pesan");
        tombolPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolPesanActionPerformed(evt);
            }
        });
        getContentPane().add(tombolPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 90, 30));

        jScrollPane2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        TabelDataMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Menu", "Harga"
            }
        ));
        TabelDataMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataMenuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelDataMenu);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 380, 420));

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });
        getContentPane().add(inputNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 320, 30));

        buttonGroup5.add(rbCaramelSauce);
        rbCaramelSauce.setText("Caramel Sauce");
        rbCaramelSauce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCaramelSauceActionPerformed(evt);
            }
        });
        getContentPane().add(rbCaramelSauce, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        buttonGroup5.add(rbCaramelCrumble);
        rbCaramelCrumble.setText("Caramel Crumble");
        rbCaramelCrumble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCaramelCrumbleActionPerformed(evt);
            }
        });
        getContentPane().add(rbCaramelCrumble, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        buttonGroup5.add(rbChocoGranola);
        rbChocoGranola.setText("Choco Granola");
        getContentPane().add(rbChocoGranola, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        buttonGroup5.add(rbSeaSalt);
        rbSeaSalt.setText("Sea Salt Cream");
        getContentPane().add(rbSeaSalt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        tombolKembali.setText("Kembali");
        getContentPane().add(tombolKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbIceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIceActionPerformed

    }//GEN-LAST:event_rbIceActionPerformed

    private void rbAlmondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlmondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlmondActionPerformed

    private void rbHotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbHotActionPerformed

    }//GEN-LAST:event_rbHotActionPerformed

    private void rbCowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCowActionPerformed

    private void rbRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRegularActionPerformed

    private void rbLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLargeActionPerformed

    private void rbNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNormalActionPerformed

    private void rbLessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLessActionPerformed

    private void rbOatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOatActionPerformed

    private void tombolPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolPesanActionPerformed
        controller.insertRiwayat();
    }//GEN-LAST:event_tombolPesanActionPerformed

    private void TabelDataMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataMenuMouseClicked

    }//GEN-LAST:event_TabelDataMenuMouseClicked

    private void labelDairyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelDairyMouseClicked
    }//GEN-LAST:event_labelDairyMouseClicked

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed

    }//GEN-LAST:event_inputNamaActionPerformed

    private void rbCaramelSauceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCaramelSauceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCaramelSauceActionPerformed

    private void rbCaramelCrumbleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCaramelCrumbleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbCaramelCrumbleActionPerformed

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
            java.util.logging.Logger.getLogger(ViewHalamanOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHalamanOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHalamanOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHalamanOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHalamanOrder().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelDataMenu;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup groupDairy;
    private javax.swing.ButtonGroup groupHotIce;
    private javax.swing.ButtonGroup groupSize;
    private javax.swing.ButtonGroup groupSweetness;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextArea inputNotes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDairy;
    private javax.swing.JLabel labelHotIce;
    private javax.swing.JLabel labelInputYourOrder;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNotes;
    private javax.swing.JLabel labelSize;
    private javax.swing.JLabel labelSweetness;
    private javax.swing.JLabel labelTopping;
    private javax.swing.JRadioButton rbAlmond;
    private javax.swing.JRadioButton rbCaramelCrumble;
    private javax.swing.JRadioButton rbCaramelSauce;
    private javax.swing.JRadioButton rbChocoGranola;
    private javax.swing.JRadioButton rbCow;
    private javax.swing.JRadioButton rbHot;
    private javax.swing.JRadioButton rbIce;
    private javax.swing.JRadioButton rbLarge;
    private javax.swing.JRadioButton rbLess;
    private javax.swing.JRadioButton rbNormal;
    private javax.swing.JRadioButton rbOat;
    private javax.swing.JRadioButton rbRegular;
    private javax.swing.JRadioButton rbSeaSalt;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolPesan;
    // End of variables declaration//GEN-END:variables
    
    //Menampilkan dari tabel 'menu' dengan jenis selain Additional (Non-Additional)
    public JTable getTableMenuNA() {
        return TabelDataMenu;
    }
    
    //Ambil nilai yang diinput user
    public String getInputNama() {
        return inputNama.getText();
    }
    
    public String getInputMenu() {
        String menu=null;
        if (baris != null) {                    
            menu = TabelDataMenu.getValueAt(baris, 0).toString();
        }
        return menu;
    }
    
    public String getInputHotIce() {
    String hotIce = null;
        if (rbHot.isSelected()) {
            hotIce = "Hot";
        } else if (rbIce.isSelected()) {
            hotIce = "Ice";
        }
        return hotIce;
    }
    
    public String getInputSize() {
    String size = null;
        if (rbRegular.isSelected()) {
            size = "Normal";
        } else if (rbLarge.isSelected()) {
            size = "Large";
        }
        return size;
    }
    
    public String getInputSweetness() {
    String sweetness = null;
        if (rbNormal.isSelected()) {
            sweetness = "Normal";
        } else if (rbLess.isSelected()) {
            sweetness = "Large";
        }
        return sweetness;
    }
    
    public String getInputDairy() {
    String dairy = null;
        if (rbCow.isSelected()) {
            dairy = "Cow Milk";
        } else if (rbOat.isSelected()) {
            dairy = "Oat Milk";
        } else if (rbAlmond.isSelected()) {
            dairy = "Almond Milk";
        }else {
            dairy = "none";
        }
        return dairy;
    }
    
    public String getInputTopping() {
    String topping = null;
        if (rbCaramelSauce.isSelected()) {
            topping = "Caramel Sauce";
        } else if (rbCaramelCrumble.isSelected()) {
            topping = "Caramel Crumble";
        } else if (rbChocoGranola.isSelected()) {
            topping = "Choco Granola";
        } else if (rbSeaSalt.isSelected()) {
            topping = "Sea Salt Cream";
        } else {
            topping = "none";
        }
        return topping;
    }
    
    public String getInputNotes() {
        return inputNotes.getText();
    }

}
