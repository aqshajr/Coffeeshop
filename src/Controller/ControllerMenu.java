package Controller;

import Model.Menu.DAOMenu;
import Model.Menu.InterfaceDAOMenu;
import Model.Menu.ModelMenu;
import Model.Menu.ModelMenuNA;
import Model.Menu.ModelTableMenu;
import Model.Menu.ModelTableMenuNA;
import View.Admin.EditDataMenu;
import View.Admin.InputDataMenu;
import View.Admin.ViewDataMenu;
import View.User.ViewHalamanOrder;
import View.User.ViewHalamanResult;
import java.util.List;
import javax.swing.JOptionPane;

public class ControllerMenu {
    
    ViewDataMenu halamanTable;
    InputDataMenu halamanInput;
    EditDataMenu halamanEdit;
    ViewHalamanOrder halamanTableNA;
    ViewHalamanResult halamanResult;

    InterfaceDAOMenu daoMenu;

    List<ModelMenu> daftarMenu;
    List<ModelMenuNA> daftarMenuNA;
    
    public ControllerMenu(ViewDataMenu halamanTable) {
        this.halamanTable = halamanTable;
        this.daoMenu = new DAOMenu();
    }
    
    public ControllerMenu(InputDataMenu halamanInput) {
        this.halamanInput = halamanInput;
        this.daoMenu = new DAOMenu();
    }
    
    public ControllerMenu(EditDataMenu halamanEdit) {
        this.halamanEdit = halamanEdit;
        this.daoMenu = new DAOMenu();
    }
    
    public ControllerMenu(ViewHalamanOrder halamanTableNA) {
        this.halamanTableNA = halamanTableNA;
        this.daoMenu = new DAOMenu();
    }
    
    public ControllerMenu(ViewHalamanResult halamanResult) {
        this.halamanResult = halamanResult;
        this.daoMenu = new DAOMenu();
    }

    public void showAllMenu() {
        daftarMenu = daoMenu.getAll();

        ModelTableMenu table = new ModelTableMenu(daftarMenu);

        halamanTable.getTableMenu().setModel(table);
    }
    
    public void showAllMenuNA() {
        daftarMenuNA = daoMenu.getNA();

        ModelTableMenuNA table = new ModelTableMenuNA(daftarMenuNA);

        halamanTableNA.getTableMenuNA().setModel(table);
    }

    public void insertMenu() {
        try {
            ModelMenu menuBaru = new ModelMenu();
            
            String nama = halamanInput.getInputNama();
            String hargaString = halamanInput.getInputHarga();
//            String jenis = halamanInput.getInputJenis();

            if ("".equals(nama) || "".equals(hargaString)) {
                throw new Exception("Nama Menu atau Harga tidak boleh kosong!");
            }
            
            int harga = Integer.parseInt(hargaString);

            menuBaru.setNama(nama);
            menuBaru.setHarga(harga);
            String jenis = "Minuman";
            menuBaru.setJenis(jenis);

            daoMenu.insert(menuBaru);
            
            JOptionPane.showMessageDialog(null, "Menu baru berhasil ditambahkan.");
            
            halamanInput.dispose();
            new ViewDataMenu();
        } catch (Exception e) {
            // Menampilkan pop-up ketika terjadi error
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }
    
    public void editMenu(int id) {
        try {
            ModelMenu menuYangMauDiedit = new ModelMenu();
                        
            String nama = halamanEdit.getInputNama();
            String hargaString = halamanEdit.getInputHarga();
            String jenis = halamanEdit.getInputJenis();

            if ("".equals(nama) || "".equals(hargaString)) {
                throw new Exception("Nama Menu atau Harga tidak boleh kosong!");
            }            
            
            int harga = Integer.parseInt(hargaString);

            menuYangMauDiedit.setId(id);
            menuYangMauDiedit.setNama(nama);
            menuYangMauDiedit.setHarga(harga);
            menuYangMauDiedit.setJenis(jenis);
            
            if(jenis.equals("Additional"))
            {
            JOptionPane.showMessageDialog(null, "Hanya dapat mengubah harga untuk jenis Additional");

            daoMenu.updateAdditional(menuYangMauDiedit);

            JOptionPane.showMessageDialog(null, "Data menu berhasil diubah.");

            halamanEdit.dispose();
            new ViewDataMenu();
            }else{
            daoMenu.update(menuYangMauDiedit);

            JOptionPane.showMessageDialog(null, "Data menu berhasil diubah.");

            halamanEdit.dispose();
            new ViewDataMenu();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }

    public void deleteMenu(Integer baris) {
        Integer id = (int) halamanTable.getTableMenu().getValueAt(baris, 0);
        String nama = halamanTable.getTableMenu().getValueAt(baris, 1).toString();

        int input = JOptionPane.showConfirmDialog(
                null,
                "Hapus " + nama + "?",
                "Hapus Menu",
                JOptionPane.YES_NO_OPTION
        );

        if (input == 0) {
            daoMenu.delete(id);
            
            JOptionPane.showMessageDialog(null, "Berhasil menghapus menu.");

            showAllMenu();
        }
    }
    
    public int gethDefault(String menu) {
        String gmenu = menu;
        return daoMenu.getHargaDefault(gmenu);
    }

    public int gethSize(String size) {
        String gsize = size;
        return daoMenu.getHargaSize(gsize);
    }

    public int gethTopping(String topping) {
        String gtopping = topping;
        return daoMenu.getHargaTopping(gtopping);
    }
    
    public int gethDairy(String dairy) {
        String gdairy = dairy;
        return daoMenu.getHargaDairy(gdairy);
}
}