package Model.Order;

public class ModelOrder {
    
    private Integer id;
    private String nama;
    private String menu;
    private String ttlharga;
    private String size;
    private String hot_ice;
    private String sweetness;
    private String topping;
    private String dairy;
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getTtlharga() {
        return ttlharga;
    }

    public void setTtlharga(String ttlharga) {
        this.ttlharga = ttlharga;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHot_ice() {
        return hot_ice;
    }

    public void setHot_ice(String hot_ice) {
        this.hot_ice = hot_ice;
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDairy() {
        return dairy;
    }

    public void setDairy(String dairy) {
        this.dairy = dairy;
    }

}

