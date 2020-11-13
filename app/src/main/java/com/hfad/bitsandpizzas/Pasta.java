package com.hfad.bitsandpizzas;

public class Pasta {
    private String name;
    private int imageResourceId;

    public static final Pasta[] pastas = {
            new Pasta("Spaghetti Bolognese", R.drawable.spagetti_bologneze),
            new Pasta("Karbonara", R.drawable.karbonara),
            new Pasta("Fetuchini", R.drawable.fetuchini),
            new Pasta("Pappardelle", R.drawable.pappardelle),
            new Pasta("Talyatelle", R.drawable.talyatelle)
    };


    public Pasta(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getName() {
        return name;
    }
}
