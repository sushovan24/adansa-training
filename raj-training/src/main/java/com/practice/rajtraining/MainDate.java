
package com.practice.rajtraining;

import com.practice.rajtraining.datetime.DateTimeExample;
import java.text.ParseException;
import java.util.Scanner;


public class MainDate {
    public static void main(String[] args) throws ParseException {
        DateTimeExample d=new DateTimeExample();
        System.out.println("Enter date to check");
        Scanner sc=new Scanner(System.in);
        String givenDate=sc.next();
        d.chechDateValid(givenDate);
    }
}
