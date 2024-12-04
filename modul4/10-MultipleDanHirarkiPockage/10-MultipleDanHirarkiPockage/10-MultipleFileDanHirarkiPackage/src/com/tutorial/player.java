package com.tutorial;

// import package eskternal
import com.terminal.console;

// import package sampai log
import static com.terminal.console.log;

class player {
    // objek vaariabel
    private String nama;

    // konstruktor
    player(String nama){
        this.nama = nama;
    }

    // method cetak
    void cetak(){
        console.log("ini menggunakan console");
        console.log("nama : " + this.nama);

        log("ini pakai log aja");
        log("nama : " + this.nama);
    }
}
