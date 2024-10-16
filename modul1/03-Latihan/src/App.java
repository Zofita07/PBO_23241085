class Motor{
    //membuat atribut untuk objek 
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    //Construktor
    //nama yang sama dengan nama class
    //tidak memiliki rerurn value nilai balik
    //method yang pertama kali di peggil saat objek di panggil

    Motor (String inputmerk, int inputtahun , String inputnoPolisi, String inputwarna){
    // isi data atribut
        merk = inputmerk;
        tahun = inputtahun;
        noPolisi = inputnoPolisi;
        warna = inputwarna;
    
    //cetak
        System.out.println ("merk : " + merk);
        System.out.println ("tahun : " + tahun);
        System.out.println ("noPolisi : " + noPolisi );
        System.out.println ("warna " + warna );

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        //Membuat objek
        Motor mtr = new Motor("honda", 2012, "DR 22345 KT", 
        "merah");
    }
}