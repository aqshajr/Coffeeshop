/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Admin.ModelAdmin;
import View.Admin.ViewHalamanLogin;
import View.Admin.ViewMenuAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class ControllerLogin {
    
    private ViewHalamanLogin view;
    ModelAdmin model;
    PreparedStatement pst;
    
    public ControllerLogin (ModelAdmin model, ViewHalamanLogin view){
        this.model = model;
        this.view = view;
    }

    public void login(String usn, String pw) {
        
         String user = usn;
         String pass = pw;
            
        try{
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeeshop", "root", "");
         String sql = "SELECT * FROM `admin` WHERE `username` = ? AND `password` = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
 
            if(rs.next()){
            String username = rs.getString("username");
            String  password = rs.getString("password");

            model.setUsername(username);
            model.setPassword(password);
            ViewMenuAdmin dataMenu = new ViewMenuAdmin();
            dataMenu.setVisible(true);
            view.dispose();
            connection.close();
            }
             else{
                    JOptionPane.showMessageDialog(null, "Username atau password salah", "Login gagal", 2);
                }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
}
