package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> Gifts = new ArrayList<>();

        Printer.initArrayRandom(Gifts, 25);

        //for (Object Item: Gifts ) System.out.println("Obj : " + Item);

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
