package com.company.FileDirectory;

abstract public class File {
    public String name;

    public String Ext;

    public File(String nameParam, String paramExt) {
        this.name = nameParam;
        this.Ext = paramExt;
    }

    public String toString(){
        return this.name + "." + this.Ext;
    }

    public String getName(){
        return this.name;
    }

    public String getExtension(){
        return this.Ext;
    }

    public void setName(String name) {
        this.name = name;
    }
}