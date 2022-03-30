package com.modes.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel{
    private String recentVideo = "";
    private List<observer> observers = new ArrayList<observer>();


    public String getrecentvideo() {
        return this.recentVideo;
    }


    public void Subscribe(observer subs) {
        this.observers.add(subs);
    }


    public void removeSubscriber(observer subs) {
        this.observers.remove(subs);
    }

    public void setRecentVideo(String newVideo) {
        this.recentVideo = newVideo;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (observer eachobserver : observers) {
            eachobserver.update();
        }
    }


}
