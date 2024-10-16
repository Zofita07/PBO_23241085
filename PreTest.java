import java.util.Scanner;

// Kelas Kalkulator
class Kalkulator {
    private double angka1;
    private double angka2;

    // Constructor untuk inisialisasi angka pertama dan kedua
    public Kalkulator(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    // Method untuk melakukan operasi matematika
    public double hitung(char operasi) {
        double hasil = 0;
        switch (operasi) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    return 0;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return 0;
        }
        return hasil;
    }
}

// Kelas utama
public class SimpleKalkulatorOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Memasukkan angka pertama dan kedua
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // Memilih operasi
        System.out.println("Pilih operasi: +, -, *, /");
        char operasi = input.next().charAt(0);

        // Membuat objek Kalkulator
        Kalkulator kalkulator = new Kalkulator(angka1, angka2);

        // Menghitung dan menampilkan hasil
        double hasil = kalkulator.hitung(operasi);
        if (hasil != 0 || operasi == '+') { // Mengecek hasil agar error message tidak ditampilkan lagi
            System.out.println("Hasil: " + hasil);
        }

        input.close();
    }
}

