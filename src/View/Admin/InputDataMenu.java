package View.Admin;

import Controller.ControllerMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class InputDataMenu extends JFrame {
    ControllerMenu controller;
    
    JLabel header = new JLabel("Input Menu");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputHarga = new JLabel("Harga");
    JTextField inputNama = new JTextField();
    JTextField inputHarga = new JTextField();
    JButton tombolTambah = new JButton("Tambah Menu");
    JButton tombolKembali = new JButton("Kembali");
//    JLabel labelJenis = new JLabel("Jenis Menu");
//    JRadioButton rbMinuman = new JRadioButton("Minuman",true);
//    JRadioButton rbAdditional = new JRadioButton("Additional");

    public InputDataMenu() {
        setTitle("Input Menu");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 250);
        setLocationRelativeTo(null);
        setLayout(null);

        add(header);
        add(labelInputNama);
        add(labelInputHarga);
        add(inputNama);
        add(inputHarga);
        add(tombolTambah);
        add(tombolKembali);
//        add(labelJenis);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputHarga.setBounds(20, 96, 440, 24);
        inputHarga.setBounds(18, 120, 440, 36);
        tombolKembali.setBounds(20, 160, 215, 40);
        tombolTambah.setBounds(240, 160, 215, 40);
//        labelJenis.setBounds(20, 180, 100, 24);
        
//        ButtonGroup pilihJenis = new ButtonGroup();
//        pilihJenis.add(rbMinuman);
//        pilihJenis.add(rbAdditional);
//        add(rbMinuman);
//        rbMinuman.setBounds(20, 204, 100, 25);
//        add(rbAdditional);
//        rbAdditional.setBounds(100, 204, 100, 25);
        

        
        controller = new ControllerMenu(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataMenu();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.insertMenu();
            }
        });
    }

    public String getInputNama() {
        return inputNama.getText();
    }

    public String getInputHarga() {
        return inputHarga.getText();
    }
    
//    public String getInputJenis() {
//        String jenis = null;
//    if (rbMinuman.isSelected()) {
//        jenis = "Minuman";
//    } else if (rbAdditional.isSelected()) {
//        jenis = "Additional";
//    }
//        return jenis;
//    }
}
