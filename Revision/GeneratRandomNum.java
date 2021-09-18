
package Revision;

import java.util.Random;


public class GeneratRandomNum {
    public static void main(String[] args) {
        
        //16 digit numeric random value
        Random rand =new Random();
        long n = (long) (rand.nextDouble()*9999999999999999L);
        String s = String.format("%016d", n);
        long x = Long.valueOf(s);
        System.out.println(" "+x);
        
        
        //16 digit random alpha numeric value
        String val="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";
        StringBuilder sb=new StringBuilder(16);
        for(int i=0; i<16; i++){
            int index = (int) (val.length()*Math.random());
            sb.append(val.charAt(index));
        }
        
        System.out.println(" "+sb.toString());
    }
}
