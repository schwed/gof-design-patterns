package com.icoderman.structural.proxy.example1;

public class ProxyDemo1 {
    public static void main(String[] args) {
        //TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());
        System.out.println(service.getTimeline("maven"));

        service.postToTimeline("icoderman", "Some message that shouldn't go through.");
    }
}
