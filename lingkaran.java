package praktikum11_ara;

public class Lingkaran extends BangunDatar {
    private double jari;
    
    
    public Lingkaran(double jari, String warna){
        this.jari = jari;
        this.warna = warna;
    }
    
    public double getJari() {
        return jari;
    }
    
    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double keliling(){
        return 2 * Math.PI * jari;
    }
    
    @Override
    public double luas(){
        return 2 * Math.PI * jari * jari;
        
    }
}
