
package com.practice.rajtraining.datetime;

import java.text.ParseException;
import java.util.Scanner;


public class DateHelp {
    
    public void InputDate() throws ParseException{
        System.out.println("Enter date");
        Scanner sc=new Scanner(System.in);
        String givendate=sc.next();
        DateTimeExample dt=new DateTimeExample();
        dt.chechDateValid(givendate);
    }
}
