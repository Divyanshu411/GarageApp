package com.example.garageapp;

public class item {
    String name, price, make;
    int image;

    public item(String name, String make, String price, int image) {
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

    public String getMake() {
        return make;
    }

    public int getImage() {
        return image;
    }
}
