package com.designpatterns.Proxy;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String url) throws Exception {
        System.out.println("Connecting to "+ url);
    }
}
