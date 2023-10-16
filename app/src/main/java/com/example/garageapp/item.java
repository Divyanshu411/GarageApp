package com.example.garageapp;

import java.io.Serializable;

public class item implements Serializable {
    String name, price, year;
    int image;

    public item(String name, String make, String price, int image) {
        this.name = name;
        this.year = make;
        this.price = price;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getYear() {
        return year;
    }

    public int getImage() {
        return image;
    }
}
