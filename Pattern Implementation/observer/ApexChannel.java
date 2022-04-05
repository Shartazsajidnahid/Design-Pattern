package com.modes.observer;

import java.util.ArrayList;
import java.util.List;

public class ApexChannel implements Service{
    private String recentVideo = "";
    private String channelName = "Apex Legends";

    private List<observer> observers = new ArrayList<observer>();



    public String getrecentvideo() {
        return this.recentVideo;
    }


    @Override
    public void Subscribe(observer subs) {
        this.observers.add(subs);
    }

    @Override
    public void removeSubscriber(observer subs) {
        this.observers.remove(subs);
    }

    public void setRecentVideo(String newVideo) {
        this.recentVideo = newVideo;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (observer eachobserver : observers) {
            eachobserver.update(this);
        }
    }

    @Override
    public String getname() {
        return this.channelName;
    }
}
