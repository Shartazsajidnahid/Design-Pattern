package com.modes.observer;

public class Subscribers implements observer{
    private String name;
    private Channel newchannel;

    public Subscribers(Channel ch, String name){
        this.newchannel = ch;
        this.name = name;
        this.newchannel.Subscribe(this);
    }
    @Override
    public void update() {
        System.out.println("Hello " + this.name + " new video uploaded : " + newchannel.getrecentvideo());
    }

}
