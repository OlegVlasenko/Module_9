package com.company;

import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        final int ARRAY_SIZE = 25;
        ArrayList<Object> Gifts = new ArrayList<>();

        Printer.initArrayRandom(Gifts, ARRAY_SIZE);

        System.out.println("Random ArrayList before encode :");
        Printer.printClass(Gifts);

        System.out.println("\nSame ArrayList after encode :");
        Printer.encodeArray(Gifts);

        Printer.printClass(Gifts);

        System.out.println("\nSame ArrayList after decode :");
        Printer.decodeArray(Gifts);

        Printer.printClass(Gifts);

    }
}
