package com.tutorial;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(3);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        Segitiga segitiga = new Segitiga(3, 4);

        System.out.println("Persegi:");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());

        System.out.println("\nLingkaran:");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        System.out.println("\nPersegi Panjang:");
        System.out.println("Luas: " + persegiPanjang.luas());
        System.out.println("Keliling: " + persegiPanjang.keliling());

        System.out.println("\nSegitiga:");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}
