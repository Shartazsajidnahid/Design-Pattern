package com.modes.observer;

public interface Service {
    String getrecentvideo();
    void setRecentVideo(String newVideo);
    void Subscribe(observer subs);
    void removeSubscriber(observer subs);
    void notifyAllObservers();
    String getname();
}
