package com.company.FileDirectory;

import java.util.ArrayList;
import java.util.List;

class Directory {
    private List<File> files = new ArrayList<>();

    public void addFile(File paramFile) {
        this.files.add(paramFile);
    }

    public void viewDir() {
        for (File file : this.files) {
            System.out.println(file.name + "." + file.Ext);
        }
    }

    public List<File> getDir() {
        return this.files;
    }

    public Directory(List<File> files) {
        this.files = files;
    }
}