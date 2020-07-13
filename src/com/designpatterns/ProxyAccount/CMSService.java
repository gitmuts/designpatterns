package com.designpatterns.ProxyAccount;

import java.math.BigDecimal;

public class CMSService implements Account {

    BFUBAccount bfubAccount = new BFUBAccount();

    @Override
    public String withdraw(BigDecimal amount) {

        System.out.println("Calling BFUB service ");
        bfubAccount.withdraw(amount);
        return "Withdrawing "+amount;
    }
}
