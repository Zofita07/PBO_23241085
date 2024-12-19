package com.tutorial;

public class Lingkaran extends BangunDatar {
    private float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    //Override
    public float luas() {
        return (float) Math.PI * r * r;
    }

    //Override
    public float keliling() {
        return 2 * (float) Math.PI * r;
    }
}

    

