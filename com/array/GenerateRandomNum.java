
package com.array;

import java.util.Random;


public class GenerateRandomNum {
    
    public static void main(String[] args) {
        Random rand = new Random();
        long n = (long) (rand.nextDouble()*10000000000000000L);
        String s = String.format("%016d", n);
        long x = Long.valueOf(s);
        System.out.println(x);
    }
}
