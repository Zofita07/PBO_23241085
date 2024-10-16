class Mahasiswa{
    //membuat atribut untuk objek 
    String nama;
    String NIM;
    String Prodi;
    Double IPK;

    //Construktor
    //nama yang sama dengan nama class
    //tidak memiliki rerurn value nilai balik
    //method yang pertama kali di peggil saat objek di panggil

    Mahasiswa (String inputnama, String inputNIM, String inputProdi, Double inputIPK){
    // isi data atribut
        nama = inputnama;
        Prodi = inputProdi;
        NIM = inputNIM;
        IPK = inputIPK;
    
    //cetak
        System.out.println ("Nama  : " + nama);
        System.out.println ("Prodi : " + Prodi);
        System.out.println ("NIM : " + NIM );
        System.out.println ("IPK " + IPK );

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //Membuat objek
        Mahasiswa mhs_1 = new Mahasiswa("zofita", "23241108", "Pti", 35.7);
    
    }
}