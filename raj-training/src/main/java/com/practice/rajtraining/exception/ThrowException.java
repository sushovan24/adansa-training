
package com.practice.rajtraining.exception;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class ThrowException {
    
    public void checkForVote() throws FileNotFoundException{
        System.out.println("enter the age");
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        
        ExceptionHelp h=new ExceptionHelp();
        h.checkAge(age);
       // h.Reader();
        h.p();
    }
}
