package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari superclass Hero
        Hero hero1 = new Hero();
        hero1.nama = "Saitama";
        hero1.cetak();

        // Membuat objek dari subclass HeroTank
        HeroTank hero2 = new HeroTank();
        hero2.nama = "Gatotkaca";
        hero2.cetak();
    }
}
