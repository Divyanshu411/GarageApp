package com.example.garageapp;

import java.io.Serializable;

public class Item implements Serializable {
    String name, price, year, imageUrl, itemAdUrl;

    public Item(String name, String make, String price, String imageUrl, String itemAdUrl) {
        this.name = name;
        this.year = make;
        this.price = price;
        this.imageUrl = imageUrl;
        this.itemAdUrl = itemAdUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }
    public String getItemAdUrl() {
        return itemAdUrl;
    }
}
