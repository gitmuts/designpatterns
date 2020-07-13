package com.designpatterns.ProxyAccount;

import java.math.BigDecimal;

public class BFUBAccount implements Account {
    @Override
    public String withdraw(BigDecimal amount) {
        return "Withdrawing "+ amount;
    }
}
