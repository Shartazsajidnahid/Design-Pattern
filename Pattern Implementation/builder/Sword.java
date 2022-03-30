package com.modes.builder;

public class Sword extends Weaponry{
    @Override
    public String name(){
        return "Sword";
    }


    @Override
    public float price() {
        return 600;
    }
}
