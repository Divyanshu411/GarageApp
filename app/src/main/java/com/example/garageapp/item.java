package com.example.garageapp;

public class item {
    String name, price;
    int make,  image;

    public item(String name, int make, String price, int image) {
        this.name = name;
        this.make = make;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getMake() {
        return make;
    }

    public int getImage() {
        return image;
    }
}
