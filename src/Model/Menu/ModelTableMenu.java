/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Menu;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ACER
 */
public class ModelTableMenu extends AbstractTableModel {

    List<ModelMenu> daftarMenu;

    String kolom[] = {"ID", "Nama Menu", "Harga", "Jenis"};

    public ModelTableMenu(List<ModelMenu> daftarMenu) {
        this.daftarMenu = daftarMenu;
    }

    @Override
    public int getRowCount() {
        return daftarMenu.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarMenu.get(rowIndex).getId();
            case 1:
                return daftarMenu.get(rowIndex).getNama();
            case 2:
                return daftarMenu.get(rowIndex).getHarga();
            case 3:
                return daftarMenu.get(rowIndex).getJenis();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return kolom[columnIndex];
    }
}
