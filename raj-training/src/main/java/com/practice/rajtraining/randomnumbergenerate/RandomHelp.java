package com.practice.rajtraining.randomnumbergenerate;

import java.time.LocalDate;
import java.util.Random;

public class RandomHelp {

    Random r = new Random();
    int i;
    int index;

    public void generatFourteenDigitRandomNum() {
        long n = (long) (r.nextDouble() * 99999999999999L);
        String s = String.format("%14d", n);
        long x = Long.valueOf(s);
        System.out.println(x);
    }

    public void generatSixteenDigitAlphaNumbericNum() {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder sb = new StringBuilder(16);

        for (i = 0; i < 16; i++) {
            index = (int) (s.length() * Math.random());
            sb.append(s.charAt(index));
        }
        System.out.println(sb.toString());
    }

    public void sixtennDigitRandomNumEndWithOH() {
        long n = (long) (r.nextDouble() * 99999999999999L);
        String s = String.format("%014d", n);
        s = s + "OH";
        System.out.println(s);
    }

    public void sixteenDigitRandomAlphaNumStartWithYear() {
        LocalDate date = LocalDate.now();
        int d = date.getYear();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder sb = new StringBuilder(12);
        for (i = 0; i < 12; i++) {
            index = (int) (s.length() * Math.random());
            sb.append(s.charAt(index));
        }
        String val = sb.toString();
        String value = d + val;
        System.out.println(value);
    }
}
