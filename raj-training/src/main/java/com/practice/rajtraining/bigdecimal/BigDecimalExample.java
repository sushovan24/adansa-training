package com.practice.rajtraining.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalExample {

    public void bigDecimalExample() {

        BigDecimal b1 = new BigDecimal("25896521.9965566");
        BigDecimal b2 = new BigDecimal("25895541.9965566");

        BigDecimalHelp bdh = new BigDecimalHelp();
        bdh.subNum(b1, b2);
        bdh.addNum(b1, b2);
        bdh.mulNum(b1, b2);
        bdh.divNum(b1, b2);

    }
}
