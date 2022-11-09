package praktikum11_ara;

public abstract class BangunDatar {
    protected String warna;
    
    public String getWarna() {
        return this.warna;
    }
    public void setWarna (String warna) {
        this.warna = warna;
    }
    
    public abstract double luas();
    public abstract double keliling ();
    
}
