package com.modes.builder;

public abstract class Weaponry implements Attributes{
    @Override
    public abstract String name();

    @Override
    public Material getMaterial() {
        return new Metal();
    }

    @Override
    public abstract float price();
}
