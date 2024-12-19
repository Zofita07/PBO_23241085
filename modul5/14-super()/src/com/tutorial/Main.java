package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // membuat objek
        Hero hero1 = new Hero();
        hero1.cetak();

        HeroTank hero2 = new HeroTank();
        hero2.cetak(); // Perbaikan: 'cerak()' diubah menjadi 'cetak()'
    }
}
