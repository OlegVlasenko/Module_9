package com.company.FlowerShop;

import java.util.ArrayList;
import java.util.List;

class Bouquet {
    private List<Flower> parts = new ArrayList<>();

    public Bouquet(Flower flower) {
        this.parts.add(flower);
    }

    public Bouquet(List<Flower> parts) {
        this.parts = parts;
    }

    public void addFlower(Flower flower) {
        this.parts.add(flower);
    }

    public void setFlower(List<Flower> parts) {
        this.parts = parts;
    }

    public List<Flower> getFlowers() {
        return this.parts;
    }

}