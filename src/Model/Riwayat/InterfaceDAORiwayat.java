package Model.Riwayat;

import java.util.List;

public interface InterfaceDAORiwayat {
    
    public int insert(ModelRiwayat riwayat);
    
    public void delete(int id);
    
    public void deleteAll();

    public List<ModelRiwayat> getAll();

    public int getTotalPendapatan();

    public void updateTotal(ModelRiwayat riwayatYangMauDiedit);
}
