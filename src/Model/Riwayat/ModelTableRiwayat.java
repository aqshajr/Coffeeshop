package Model.Riwayat;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModelTableRiwayat extends AbstractTableModel {

    List<ModelRiwayat> daftarRiwayat;

    String kolom[] = {"ID", "Nama Pelanggan", "Menu Yang Dipesan", "Harga"};

    public ModelTableRiwayat(List<ModelRiwayat> daftarRiwayat) {
        this.daftarRiwayat = daftarRiwayat;
    }

    @Override
    public int getRowCount() {
        return daftarRiwayat.size();
    }

    @Override
    public int getColumnCount() {
        return kolom.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarRiwayat.get(rowIndex).getId();
            case 1:
                return daftarRiwayat.get(rowIndex).getNama();
            case 2:
                return daftarRiwayat.get(rowIndex).getMenu();
            case 3:
                return daftarRiwayat.get(rowIndex).getTtlharga();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        return kolom[columnIndex];
    }
}

