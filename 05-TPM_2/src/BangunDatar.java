public class BangunDatar {
    // Atribut publik
    double panjang;
    double lebar;

    // Constructor
     BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas (tidak mengembalikan nilai)
   void hitungLuas() {
        double luas = panjang * lebar;
        System.out.println("Luas: " + luas);
    }

    // Method untuk menghitung keliling (tidak mengembalikan nilai)
    void hitungKeliling() {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling: " + keliling);
    }

    // Method untuk mencetak hasil luas
   double cetakHasil() {
        double luas = panjang * lebar;
        return luas;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas BangunDatar
        BangunDatar persegiPanjang = new BangunDatar(12.0, 6.0);
        
        // Memanggil method hitungLuas dan hitungKeliling
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        
        // Mencetak hasil luas dengan method cetakHasil
        System.out.println("Hasil cetak luas: " + persegiPanjang.cetakHasil());

        BangunDatar persegi = new BangunDatar(5.0, 5.0);
        persegiPanjang.hitungLuas();
        persegiPanjang.hitungKeliling();
        System.out.println("Hasil cetak luas: " + persegi.cetakHasil());

        persegi.hitungLuas();
        persegi.hitungKeliling();
        System.out.println("Hasil cetak keliling: " + persegi.cetakHasil());


    }
}
    

