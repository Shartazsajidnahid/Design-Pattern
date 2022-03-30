package com.modes.builder;

public abstract class Clothing implements Attributes{
    @Override
    public abstract String name();

    @Override
    public Material getMaterial() {
        return new Cotton();
    }

    @Override
    public abstract float price() ;
}
