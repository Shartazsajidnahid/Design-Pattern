package com.modes.observer;

public class Advertisers implements observer{
    private String name;
    private Channel newchannel;

    public Advertisers(Channel ch, String name){
        this.newchannel = ch;
        this.name = name;
        this.newchannel.Subscribe(this);
    }
    @Override
    public void update() {
        System.out.println("Mr. " + this.name + " please advertise the new video uploaded: " + newchannel.getrecentvideo());
    }
}
