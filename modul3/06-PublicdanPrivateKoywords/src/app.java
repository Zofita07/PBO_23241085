class Player{
    //data member atau variabel 
    String nama; //default, bisa dii akses dari luar clas
    public int exp; //public, bisa diakses dari luar
    private int health; //tidak bisa di akses dari luar kelas

    // konstruktor modifier default
    Player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
    // method, default
    void cetak(){
        kuarngEXP();
        System.out.println("Player : " + this.nama);
        System.out.println("EXP : " + this.exp);
        System.out.println("Health : " + this.health);
    }
    //method, public
    public void ubahHealth(int value) {
        this.health = value;
    }

    //method provate
    private void kuarngEXP(){
        this.exp -= 10; // exp= exp-10
    }

}

// Kelas utama
public class app {
    public static void main(String[] args) {
        //instansiasi objek
        Player player1 = new Player ("ita" , 50, 100);


        //dafault
        //membaca
        System.out.println(player1.nama);
        //menulis
        player1.nama = "ita";
        //membaca
        System.out.println(player1.nama);

        //public
        //membaca
        System.out.println(player1.exp);
        //menulis
        player1.exp =75;
        //membaca
        System.out.println(player1.exp);

        //membaca private
        player1.ubahHealth(125);
        player1.cetak();

        //method private
        player1.cetak();
    }
}

       