package com.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedException {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int num = 0;
        try {
            System.out.println("enter index number to check the value");
            Scanner sc = new Scanner(System.in);
            int index = sc.nextInt();

            System.out.println("enter number by which you can divide the index value");
            num = sc.nextInt();

            int val = arr[index] / num;
            System.out.println(val);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("Enter index value less then " + arr.length);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println("index value can't be divided by " + num);
        } catch (InputMismatchException n) {
            System.out.println(n);
            System.out.println("Please use only Integer value for index");
        }
    }
}
