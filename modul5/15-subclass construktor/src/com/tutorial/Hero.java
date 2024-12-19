package com.tutorial;

public class Hero {
    // atribut
    String nama;
    double defancePower;
    double attacPower;

    // konstruktor
    public Hero(String nama, double defancePower, double attacPower) {
        this.nama = nama;
        this.defancePower = defancePower;
        this.attacPower = attacPower;
    }

    // method
    void cetak() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Defance Power: " + this.defancePower);
        System.out.println("Attack Power: " + this.attacPower);
    }
}
