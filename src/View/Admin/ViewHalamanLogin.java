package View.Admin;

import Controller.ControllerLogin;
import Model.Admin.ModelAdmin;
import View.User.ViewHalamanUtama;
import javax.swing.JFrame;

public class ViewHalamanLogin extends javax.swing.JFrame {

    public ViewHalamanLogin() {
        initComponents();
        setTitle("Halaman Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    ModelAdmin model = new ModelAdmin();
    ControllerLogin controller = new ControllerLogin(model,this);
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputPassword = new javax.swing.JPasswordField();
        navbar = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        tombolKembali = new javax.swing.JButton();
        tombolLogin = new javax.swing.JButton();
        latar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(530, 350));
        setSize(new java.awt.Dimension(530, 350));
        getContentPane().setLayout(null);

        labelUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelUsername.setText("Username");
        getContentPane().add(labelUsername);
        labelUsername.setBounds(50, 110, 90, 21);

        labelPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelPassword.setText("Password");
        getContentPane().add(labelPassword);
        labelPassword.setBounds(50, 170, 80, 16);
        getContentPane().add(inputUsername);
        inputUsername.setBounds(200, 110, 260, 30);
        getContentPane().add(inputPassword);
        inputPassword.setBounds(200, 170, 260, 30);

        navbar.setBackground(new java.awt.Color(159, 130, 120));
        navbar.setLayout(null);

        labelLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        labelLogin.setText("Login Admin");
        navbar.add(labelLogin);
        labelLogin.setBounds(200, 20, 150, 29);

        tombolKembali.setBackground(new java.awt.Color(252, 252, 252));
        tombolKembali.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tombolKembali.setText("Kembali");
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });
        navbar.add(tombolKembali);
        tombolKembali.setBounds(20, 20, 80, 30);

        getContentPane().add(navbar);
        navbar.setBounds(0, 0, 520, 70);

        tombolLogin.setBackground(new java.awt.Color(160, 130, 120));
        tombolLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tombolLogin.setText("Login");
        tombolLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolLoginActionPerformed(evt);
            }
        });
        getContentPane().add(tombolLogin);
        tombolLogin.setBounds(200, 240, 90, 40);

        latar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        latar.setText("jLabel4");
        latar.setMaximumSize(new java.awt.Dimension(1321, 865));
        latar.setMinimumSize(new java.awt.Dimension(1321, 865));
        getContentPane().add(latar);
        latar.setBounds(0, 30, 520, 360);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolLoginActionPerformed
        tombolLoginAction(inputUsername.getText(),inputPassword.getText());
    }//GEN-LAST:event_tombolLoginActionPerformed

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        tombolKembaliAction();
    }//GEN-LAST:event_tombolKembaliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JLabel latar;
    private javax.swing.JPanel navbar;
    private javax.swing.JButton tombolKembali;
    private javax.swing.JButton tombolLogin;
    // End of variables declaration//GEN-END:variables

    private void tombolLoginAction(String usn, String pw) {
        controller.login(usn,pw);
    }

    private void tombolKembaliAction() {
        new ViewHalamanUtama().setVisible(true);
        this.dispose();
    }
    
}

