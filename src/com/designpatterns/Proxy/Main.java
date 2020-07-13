package com.designpatterns.Proxy;

public class Main {

    public static void main(String[] args){
        InternetProxy internetProxy = new InternetProxy();

        try{
            internetProxy.connectTo("github.com");
            internetProxy.connectTo("abc.com");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

        try{
            internetProxy.connectTo("abc.com");
        } catch (Exception e){
            System.err.println(e.getMessage());
        }


    }
}
