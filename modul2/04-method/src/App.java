class Mahasiswa {
    // Atribut atau data atribut
    String nama;
    String nim;

    // Constructor
    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Method tanpa return untuk menampilkan nama dan nim
    void cetak() {
        System.out.println("Nama Mahasiswa: " + this.nama);
        System.out.println("NIM Mahasiswa: " + this.nim);
    }

    // Method tanpa return dengan parameter untuk mengubah nama
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return tanpa parameter untuk mendapatkan nama
    String getNama() {
        return this.nama;
    }

    // Method dengan return tanpa parameter untuk mendapatkan NIM
    String getNIM() {
        return this.nim;
    }
}

// Kelas utama
public class App {
    public static void main(String[] args) throws Exception {
        // Instansi objek
        Mahasiswa mhs_1 = new Mahasiswa("Zofita", "23241085");

        // Memanggil method cetak
        mhs_1.cetak();

        // Mengubah variabel nama
        mhs_1.setNama("Ita");
        mhs_1.cetak();

        // Mencetak nilai variabel nama dan nim
        System.out.println(mhs_1.getNama());
        System.out.println(mhs_1.getNIM());
    }
}
 