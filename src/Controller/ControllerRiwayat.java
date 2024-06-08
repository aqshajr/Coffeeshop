package Controller;

import Model.Riwayat.DAORiwayat;
import Model.Riwayat.InterfaceDAORiwayat;
import Model.Riwayat.ModelRiwayat;
import Model.Riwayat.ModelTableRiwayat;
import View.Admin.ViewRiwayat;
import View.User.ViewHalamanOrder;
import View.User.ViewHalamanResult;

import java.util.List;
import javax.swing.JOptionPane;

public class ControllerRiwayat {
    
    ViewRiwayat halamanTable;
    ViewHalamanOrder halamanOrder;
    ViewHalamanResult halamanResult;

    InterfaceDAORiwayat daoRiwayat;
    List<ModelRiwayat> daftarRiwayat;
    
    //ControllerRiwayat untuk digunakan pada halamanTable(ViewRiwayat)
    public ControllerRiwayat(ViewRiwayat halamanTable) {
        this.halamanTable = halamanTable;
        this.daoRiwayat = new DAORiwayat();
    }
    
    //ControllerRiwayat untuk digunakan pada halamanOrder(ViewHalamanOrder)
    public ControllerRiwayat(ViewHalamanOrder halamanOrder) {
        this.halamanOrder = halamanOrder;
        this.daoRiwayat = new DAORiwayat();
    }
    
    public ControllerRiwayat(ViewHalamanResult halamanResult) {
        this.halamanResult = halamanResult;
        this.daoRiwayat = new DAORiwayat();
    }

    public void showAllRiwayat() {
        daftarRiwayat = daoRiwayat.getAll();

        ModelTableRiwayat table = new ModelTableRiwayat(daftarRiwayat);

        halamanTable.getTableRiwayat().setModel(table);
    }

    public void insertRiwayat() {
        try {
            ModelRiwayat riwayatBaru = new ModelRiwayat();
            
            String nama = halamanOrder.getInputNama();
            String menu = halamanOrder.getInputMenu();
            String hotice = halamanOrder.getInputHotIce();
            String size = halamanOrder.getInputSize();
            String sweetness = halamanOrder.getInputSweetness();
            String dairy = halamanOrder.getInputDairy();
            String topping = halamanOrder.getInputTopping();
            String notes = halamanOrder.getInputNotes();
            int ttlharga = 0;
            
//            System.out.println("Nama: " + nama);
//            System.out.println("Menu: " + menu);
//            System.out.println("Hot/Ice: " + hotice);
//            System.out.println("Size: " + size);
//            System.out.println("Sweetness: " + sweetness);
//            System.out.println("Dairy: " + dairy);
//            System.out.println("Topping: " + topping);
//            System.out.println("Notes: " + notes);

       
            if (nama == null || nama.trim().isEmpty() || menu == null){
                throw new Exception("Silakan isi nama dan menu terlebih dahulu");
            }
            
            riwayatBaru.setNama(nama);
            riwayatBaru.setMenu(menu);
            riwayatBaru.setHotIce(hotice);
            riwayatBaru.setSize(size);
            riwayatBaru.setSweetness(sweetness);
            riwayatBaru.setDairy(dairy);
            riwayatBaru.setTopping(topping);
            riwayatBaru.setNotes(notes);
            riwayatBaru.setTtlharga(ttlharga);

            int idBaru = daoRiwayat.insert(riwayatBaru);
                        
            halamanOrder.dispose();
            new ViewHalamanResult(riwayatBaru, idBaru).setVisible(true);
        } catch (Exception e) {
            // Menampilkan pop-up ketika terjadi error
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }
    
    public void deleteRiwayat(Integer baris) {
        Integer id = (int) halamanTable.getTableRiwayat().getValueAt(baris, 0);
        String nama = halamanTable.getTableRiwayat().getValueAt(baris, 1).toString();

        int input = JOptionPane.showConfirmDialog(
                null,
                "Hapus " + nama + "?",
                "Hapus Riwayat",
                JOptionPane.YES_NO_OPTION
        );

        if (input == 0) {
            daoRiwayat.delete(id);
            
            JOptionPane.showMessageDialog(null, "Berhasil menghapus data.");

            showAllRiwayat();
        }
    }
    
    public void deleteSemuaRiwayat() {
            
        int input = JOptionPane.showConfirmDialog(
                null,
                "Hapus semua riwayat?",
                "Hapus Riwayat",
                JOptionPane.YES_NO_OPTION
        );

        if (input == 0) {
            daoRiwayat.deleteAll();
            
            JOptionPane.showMessageDialog(null, "Berhasil menghapus semua data.");

            showAllRiwayat();
        }
    }
    
    public int getTotalPendapatan() {
        return daoRiwayat.getTotalPendapatan();
    }
    
    public void updateTotalHarga(int id, int htotal) {
        try {
            ModelRiwayat riwayatYangMauDiedit = new ModelRiwayat();
                        
            int total = htotal;

            riwayatYangMauDiedit.setId(id);
            riwayatYangMauDiedit.setTtlharga(total);
            
            daoRiwayat.updateTotal(riwayatYangMauDiedit);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

}
