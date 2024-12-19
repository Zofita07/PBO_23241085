package com.tutorial;

// Subclass HeroTank yang mewarisi Hero
public class HeroTank extends Hero {
    public int defensePower;

    @Override
    public void cetak() {
        super.cetak(); // Memanggil metode cetak() dari superclass
        System.out.println("Defense Power: " + defensePower);
    }
}
