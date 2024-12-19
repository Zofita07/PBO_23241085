package com.tutorial;

public class HeroTank extends Hero {
    // atribut
    String nama = "ini class Hero Tank";

    // overriding method
    @Override
    void cetak() {
        // Memanggil atribut 'nama' dari superclass menggunakan 'super'
        System.out.println("Ini adalah: " + super.nama);

        // Tambahkan jika ingin mencetak atribut 'nama' dari subclass
        System.out.println("Dan ini adalah: " + this.nama);
    }
}
