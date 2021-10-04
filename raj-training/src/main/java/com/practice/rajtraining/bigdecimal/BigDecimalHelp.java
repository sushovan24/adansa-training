package com.practice.rajtraining.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalHelp {

    public void subNum(BigDecimal a, BigDecimal b) {
        BigDecimal c = a.subtract(b);
        System.out.println("sub: " + c);

    }

    public void addNum(BigDecimal a, BigDecimal b) {
        BigDecimal bd = a.add(b);
        System.out.println("add: " + bd);
    }

    public void mulNum(BigDecimal a, BigDecimal b) {
        BigDecimal d = a.multiply(b);
        System.out.println("mul: " + d);
    }

    public void divNum(BigDecimal a, BigDecimal b) {
        try {
            BigDecimal bd = a.divide(b);
            System.out.println("div: " + bd);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
