package View.Admin;

import Controller.ControllerRiwayat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewRiwayat extends JFrame {

    Integer baris;

    ControllerRiwayat controller;

    JLabel header = new JLabel("Riwayat Order");
    JButton tombolHapus = new JButton("Hapus Riwayat");
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolHapusSemua = new JButton("Hapus Semua Riwayat");
    JLabel labelTotal = new JLabel("Total Pendapatan");
    JLabel total = new JLabel("Rp ");

    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;

    String namaKolom[] = {"ID", "Nama Pelanggan", "Nama Menu", "Total Harga"};

    public ViewRiwayat() {
        tableModel = new DefaultTableModel(namaKolom, 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        setTitle("Riwayat Order");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(560, 540);
        setLocationRelativeTo(null);
        setLayout(null);

        add(header);
        add(scrollPane);
        add(tombolHapus);
        add(tombolKembali);
        add(labelTotal);
        add(total);
        add(tombolHapusSemua);

        header.setBounds(20, 8, 440, 24);
        scrollPane.setBounds(20, 36, 512, 320);
        tombolHapus.setBounds(20, 400, 512, 40);
        tombolKembali.setBounds(430, 8, 100,24);
        labelTotal.setBounds(20, 365, 100, 25);
        total.setBounds(170, 365, 100, 25);
        tombolHapusSemua.setBounds(20, 446, 512, 40);

        controller = new ControllerRiwayat(this);
        controller.showAllRiwayat();
        updateTotalPendapatan();

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                baris = table.getSelectedRow();
            }
        });

        tombolHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (baris != null) {
                    controller.deleteRiwayat(baris);
                    updateTotalPendapatan();
                    baris = null;
                } else {
                    JOptionPane.showMessageDialog(null, "Data belum dipilih.");
                }
            }
        });
        
        tombolHapusSemua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (table.getRowCount() > 0) {
                        controller.deleteSemuaRiwayat();
                        updateTotalPendapatan();
                } else {
                    JOptionPane.showMessageDialog(null, "Data kosong.");
                }
            }
        });
        
        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewMenuAdmin().setVisible(true);
            }
        });
    }

    public JTable getTableRiwayat() {
        return table;
    }
    
    private void updateTotalPendapatan() {
        int totalPendapatan = controller.getTotalPendapatan();
        total.setText("Rp " + totalPendapatan);
    }
}
