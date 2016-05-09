package com.company.FlowerShop;

public class Flower {
    private String name;

    Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}