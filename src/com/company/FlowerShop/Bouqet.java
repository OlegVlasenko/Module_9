package com.company.FlowerShop;

import java.util.ArrayList;
import java.util.List;

public class Bouqet {
    private List<Flower> parts;

    public Bouqet ( Flower flower){
        this.parts = new ArrayList<>();
        this.parts.add( flower );
    }

    public Bouqet (List<Flower> parts) {
        this.parts = new ArrayList<>();
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