package com.company.FileDirectory;

public class Mp3 extends File {

    private String name;

    public Mp3(String nameParam ) {
        super(nameParam, "mp3");
        this.name = nameParam;
    }

}