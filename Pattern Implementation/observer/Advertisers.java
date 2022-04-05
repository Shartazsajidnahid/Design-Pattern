package com.modes.observer;

public class Advertisers implements observer{
    private String name;
    private Service newchannel;

    public Advertisers(Service ch, String name){
        this.newchannel = ch;
        this.name = name;
        this.newchannel.Subscribe(this);
    }
    @Override
    public void update(Service ch) {
        System.out.println("Mr. " + this.name + " please advertise the new video uploaded from "+  ch.getname() + ": " + newchannel.getrecentvideo());
    }
}
