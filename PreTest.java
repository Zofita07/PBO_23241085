import java.util.Scanner;

public class PreTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            // Menampilkan pilihan operasi
            System.out.println("Pilih operasi:");
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Penjumlahan");
            System.out.println("4. Pengurangan");

            // Input pilihan operasi
            System.out.print("Masukkan pilihan (1-4): ");
            int pilihan = input.nextInt();

            // Input bilangan pertama
            System.out.print("Masukkan bilangan pertama: ");
            double bilanganPertama = input.nextDouble();

            // Input bilangan kedua
            System.out.print("Masukkan bilangan kedua: ");
            double bilanganKedua = input.nextDouble();

            // Variabel hasil
            double hasil = 0;

            // Switch untuk memilih operasi
            switch (pilihan) {
                case 1:
                    hasil = bilanganPertama * bilanganKedua;
                    System.out.println("Hasil dari " + bilanganPertama + " x " + bilanganKedua + " = " + hasil);
                    break;
                case 2:
                    // Cek pembagian dengan nol
                    if (bilanganKedua != 0) {
                        hasil = bilanganPertama / bilanganKedua;
                        System.out.println("Hasil dari " + bilanganPertama + " / " + bilanganKedua + " = " + hasil);
                    } else {
                        System.out.println("Error: Tidak bisa membagi dengan nol.");
                    }
                    break;
                case 3:
                    hasil = bilanganPertama + bilanganKedua;
                    System.out.println("Hasil dari " + bilanganPertama + " + " + bilanganKedua + " = " + hasil);
                    break;
                case 4:
                    hasil = bilanganPertama - bilanganKedua;
                    System.out.println("Hasil dari " + bilanganPertama + " - " + bilanganKedua + " = " + hasil);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih antara 1 hingga 4.");
                    break;
            }

            // Konfirmasi untuk mengulang
            System.out.print("Apakah ingin mengulang? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai.");
        input.close();
    }
}