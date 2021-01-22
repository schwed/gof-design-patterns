package com.icoderman.structural.proxy.example1;

public class TwitterServiceStub implements TwitterService {
    @Override
    public String getTimeline(String screenName) {
        return "My neato timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
