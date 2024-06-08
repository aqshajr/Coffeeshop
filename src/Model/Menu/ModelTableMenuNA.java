package Model.Menu;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableMenuNA extends AbstractTableModel {

    List<ModelMenuNA> daftarMenu;

    String kolom[] = {"Nama Menu", "Harga"};

    public ModelTableMenuNA(List<ModelMenuNA> daftarMenu) {
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
                return daftarMenu.get(rowIndex).getNama();
            case 1:
                return daftarMenu.get(rowIndex).getHarga();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return kolom[columnIndex];
    }
}

