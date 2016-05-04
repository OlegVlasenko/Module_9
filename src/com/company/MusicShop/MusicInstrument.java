package com.company.MusicShop;

abstract public class MusicInstrument {
    private InstrumentsType type;

    public MusicInstrument(InstrumentsType type) {
        this.type = type;
    }

    public InstrumentsType getType(){
        return  this.type;
    }

    public String toString(){
        return type.toString();
    }

    public String getName(){
        return this.type.toString();
    }

    public void setType(InstrumentsType type) {
        this.type = type;
    }
}
