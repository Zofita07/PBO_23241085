package com.tutorial;

public class HeroTank extends Hero {
    // atribut
    String atribut = "tank";

    // konstruktor subclass
    public HeroTank(String nama, double defance, double attack) {
        super(nama, defance, attack);
    }

    // override method cetak
    @Override
    void cetak() {
        super.cetak(); // Memanggil method cetak dari superclass
        System.out.println("Atribut: " + this.atribut);
    }
}
