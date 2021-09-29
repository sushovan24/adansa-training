
package com.practice.mohsintraining.exception;

import java.util.Scanner;


public class TryCatchBlock {
    
    public static void trycatchblock() {
            Scanner scan=new Scanner(System.in);
	    System.out.println("please enter the value");
	    int a=scan.nextInt();
	    System.out.println("please enter the values");
	    int b=scan.nextInt();
	    int c;
	    try
	    {
	    	c=a/b;
	    	System.out.println("value of c="+c);
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("kind your information dont divided by zero ");
	    }
	}

}