package TwentyOneSep;

import java.util.Scanner;

public class CheckString {

    public static void main(String[] args) {
        System.out.println("Enter first Strings");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2="i no him";
        System.out.println(s1.contains("hi man"));
        System.out.println(s1.contains("hi"));
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        
        String s3="INDIA IS MY COUNTARY";
        String s4="india is my countary";
        
        System.out.println("");
        System.out.println(s3.compareTo(s4));
        System.out.println(s4.compareTo(s3));
    }
}
