package praktikum11_ara;

public class Praktikum11_ara {

    public static void main(String[] args) {
        BangunDatar lingkaran = new Lingkaran(10, "Merah");
        BangunDatar segiTiga = new SegiTiga(13, 5, "Biru");
        BangunDatar segiEmpat = new SegiEmpat(5, "Hitam");
        
        BangunDatar[] bangunDatar = new BangunDatar[3];
        bangunDatar[0] = lingkaran;
        bangunDatar[1] = segiTiga;
        bangunDatar[2] = segiEmpat;
        
        for (int i = 0; i < 3; i++){
            System.out.println("Bangun Datar " + (i + 1));
            System.out.println("Warna : " + bangunDatar[i].getWarna());
            System.out.println("luas : " + bangunDatar[i].luas());
            System.out.println("Keliling : " + bangunDatar[i].keliling());
             System.out.println();
        }
    }
    
}
