package  com.tutorial ;

public class Player {
    //atribut
    private static  int jumlahPlayer;
    private String nama;

    //opsi1
    //konstruktor
    Player (String nama) {
        Player.jumlahPlayer++;
        this.nama = nama;
    }
    //opsi2
     //overloading construktor
    Player() {
        Player.jumlahPlayer++;
        this.nama = "Player" + Player.jumlahPlayer;
    }
    
   //method cetakP
   //method cetak
   void cetak(){
    System.out.println("nama"  + this.nama);

   }
   
    
}

