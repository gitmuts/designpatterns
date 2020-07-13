package com.designpatterns.ProxyAccount;

import java.math.BigDecimal;

public class Main {

    public  static  void main(String[] args){
        CMSService cmsService = new CMSService();

        String response = cmsService.withdraw(new BigDecimal(1000));

        System.out.println(response);


    }
}
