package Model.Menu;
import java.util.List;

public interface InterfaceDAOMenu {
    public void insert(ModelMenu menu);
    
    public void update(ModelMenu menu);
    
    public void updateAdditional(ModelMenu menu);
    
    public void delete(int id);
    
    public List<ModelMenu> getAll();
    
    public List<ModelMenuNA> getNA();

    public int getHargaDefault(String gmenu);

    public int getHargaSize(String gsize);

    public int getHargaTopping(String gtopping);

    public int getHargaDairy(String gdairy);
}