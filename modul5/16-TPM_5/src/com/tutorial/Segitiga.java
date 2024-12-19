package com.tutorial;

// Pastikan kelas BangunDatar memiliki luas() dan keliling()
public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    //Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }

    //Override
    public float keliling() {
        // Menggunakan keliling segitiga siku-siku
        float sisiMiring = (float) Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + sisiMiring;
    }
}
