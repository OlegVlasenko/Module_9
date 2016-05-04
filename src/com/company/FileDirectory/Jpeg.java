package com.company.FileDirectory;

public class Jpeg extends File {

    private String name;

    public Jpeg(String nameParam ) {
        super(nameParam, "jpg");
        this.name = nameParam;
    }

}