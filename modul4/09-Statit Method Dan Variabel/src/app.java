import java.sql.Array;
import java.util.ArrayList;

class Player {
    // Variabel objek
    private String nama;
    // Static variabel
    private static int numberPlayer;
    
    //static varuabel menampung nama
    private static ArrayList<String> namaList = new  ArrayList<String>();

    // Konstruktor
    Player(String nama){
        this.nama = nama;
        Player.numberPlayer++; // add objek menambah objek
        Player.namaList.add(this.nama);
    }

    // Method untuk baca private
    void cetak(){
        System.out.println("Nama: " + this.nama);
    }

    // Static method
    static void showNumberofPlayer() {
        System.out.println("Number of Players: " + Player.numberPlayer);
    
    }
    static ArrayList<String> getNama(){
        return Player.namaList;
    }
}

public class app {
    public static void main(String[] args) throws Exception {
        // Membuat objek baru
        Player player1 = new Player("Hinata Shoyo");
        Player player2 = new Player("Yoshimura");
        Player player3 = new Player("Saitama");
        Player player4 = new Player("Luffy");
        Player player5 = new Player("Anonymous");

        //menrapkan static variavel dan method
        Player.showNumberofPlayer();

        // Menampilkan jumlah pemain
        Player.showNumberofPlayer();
    }
}
