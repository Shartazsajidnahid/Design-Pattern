package com.modes.observer;

public class Youtube {
    public void drive(){
        Channel newchannel = new Channel();

        observer S1 = new Subscribers( newchannel, "S1");
        observer S2 = new Subscribers( newchannel, "S2");
        observer A3 = new Advertisers( newchannel, "A3");
        observer A4 = new Advertisers(newchannel, "A4");



        newchannel.setRecentVideo("Design Pattern Tutorials");

        newchannel.removeSubscriber(S2);
        System.out.println("\nAfter removing S2\n");

        newchannel.setRecentVideo("Webtech Tutorials");
    }

}
