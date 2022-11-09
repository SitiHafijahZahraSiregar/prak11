package praktikum11_ara;

public class SegiEmpat extends BangunDatar{
    private double sisi;

public SegiEmpat() {
}

@Override
public double luas() {
    return this.sisi * this.sisi;
}

@Override
public double keliling() {
    return 4 * sisi ;
}

    public SegiEmpat(double sisi, String warna) {
        this.sisi = sisi;
        this.warna = warna;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

}
