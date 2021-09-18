package com.array;

import java.util.Scanner;

public class ArithmeticExcep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Want to perform division operation on two number");
        System.out.println("");
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();

        try {

            int result = n1 / n2;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Please enter valid input..."+n1+" is not divided by "+n2);
            System.out.println("if You want to divide Any value by zero it will go for infinite time");
        }

    }
}
