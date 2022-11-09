package praktikum11_ara;

public class SegiTiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public SegiTiga(double alas, double tinggi, String warna) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }      
 
    public SegiTiga(){
    }
    @Override
    public double luas(){
        return this.alas*this.tinggi/2;
    }
    
    @Override
    public double keliling(){
        return 3*this.alas;
    }
    public double getAlas(){
        return alas;
    }
    public void setAlas(double alas){
        this.alas=alas;
    }
    
}
