package com.modes.observer;

public class Subscribers implements observer{
    private String name;
    private ValorantChannel newchannel;

    public Subscribers(ValorantChannel ch, String name){
        this.newchannel = ch;
        this.name = name;
        this.newchannel.Subscribe(this);
    }
    @Override
    public void update(Service ch) {
        System.out.println("Hello " + this.name + " new video uploaded from " + ch.getname() + ": " + newchannel.getrecentvideo());
    }

}
