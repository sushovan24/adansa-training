package Revision;

import java.util.Scanner;

public class ReverseStringWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String ");
        String s = sc.nextLine();
        String result = "";
        String arr[] = s.split(" ");

        for (String w : arr) {
            char ch[] = new char[w.length()];
            for (int j = 0; j < w.length(); j++) {
                ch[ch.length - j - 1] = w.charAt(j);

            }
            String ss = String.valueOf(ch);
            result += ss + " ";
        }

        System.out.println(" " + result);
    }
}
