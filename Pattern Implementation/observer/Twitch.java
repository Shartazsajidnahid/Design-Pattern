package com.modes.observer;

public class Twitch {
    public void drive(){
        ValorantChannel valorant = new ValorantChannel();
        ApexChannel apex = new ApexChannel();

        observer S1 = new Subscribers( valorant, "S1");
        observer S2 = new Subscribers( valorant, "S2");
        observer A3 = new Advertisers( apex, "A3");
        observer A4 = new Advertisers(apex, "A4");



        valorant.setRecentVideo("Aimbot Tutorial");

//        valorant.removeSubscriber(S2);
        System.out.println("\nAfter removing S2\n");

        apex.setRecentVideo("Move like pros");
    }

}
