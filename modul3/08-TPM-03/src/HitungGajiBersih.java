class Pegawai {
    // Deklarasi variabel privat
    private int gajiPokok;
    private int tunjangan;
    private double pajak; // dalam persen

    // Setter dan Getter untuk gaji pokok
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    // Setter dan Getter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    // Setter dan Getter untuk pajak (dalam persen)
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }

    // Menghitung pajak dalam rupiah
    public double getPajak() {
        return (pajak / 100) * (gajiPokok + tunjangan);
    }

    // Metode untuk menghitung dan mencetak gaji bersih
    public void cetakGajiBersih() {
        double gajiKotor = gajiPokok + tunjangan;
        double gajiBersih = gajiKotor - getPajak();
        System.out.printf("Gaji bersih Anda adalah sebesar Rp.%.2f\n", gajiBersih);
    }
}

public class HitungGajiBersih {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai();

        // Set gaji pokok, tunjangan, dan pajak
        pegawai.setGajiPokok(5000000); // contoh gaji pokok Rp. 5,000,000
        pegawai.setTunjangan(500000);  // contoh tunjangan Rp. 500,000
        pegawai.setPajak(5);          // contoh pajak 5%

        // Cetak gaji bersih
        pegawai.cetakGajiBersih();
    }
}
