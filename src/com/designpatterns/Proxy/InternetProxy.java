package com.designpatterns.Proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements  Internet {

    Internet internet = new RealInternet();
    private static List<String> blacklistedSites = new ArrayList<>();

    static
    {
        blacklistedSites = new ArrayList<String>();
        blacklistedSites.add("github.com");
        blacklistedSites.add("youtube.com");
        blacklistedSites.add("twitter.com");
        blacklistedSites.add("facebook.com");
    }

    @Override
    public void connectTo(String url) throws Exception {
        if(blacklistedSites.contains(url.toLowerCase()))
        {
            throw new Exception("Access Denied");
        }

        internet.connectTo(url);
    }
}
