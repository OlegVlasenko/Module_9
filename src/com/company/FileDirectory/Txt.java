package com.company.FileDirectory;

public class Txt extends File {

    private String name;

    public Txt(String nameParam ) {
        super(nameParam, "txt");
        this.name = nameParam;
    }
}