
package com.array;


public class RandomAlphaNumericValue {
    public static void main(String[] args) {
        String value = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";
        StringBuilder sb=new StringBuilder(16);
        for(int i=0; i<16; i++){
            int index = (int) (value.length()*Math.random());
            
            sb.append(value.charAt(index));
        }
        
        System.out.println(sb.toString());
    }
}
