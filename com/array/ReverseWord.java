package com.array;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        String arr[] = s.split(" ");
      
        for (String ss : arr) {
            char ch[] = new char[ss.length()];

            for (int j = 0; j < ch.length; j++) {
                ch[ss.length() - j - 1] = ss.charAt(j);
            }

            String val = String.valueOf(ch);
            rev = rev + val + " ";
        }

        System.out.println(rev);

    }
}
