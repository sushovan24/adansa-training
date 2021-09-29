
package com.practice.mohsintraining.evenoddno;

import java.util.Scanner;
public class EvenOddNo {
    // even and odd no program
	public static void evenoddno() {
	Scanner scan=new Scanner(System.in);// for user input the no
	System.out.println("enter the no");
	int no=scan.nextInt();
	if(no%2==0)
	{
		System.out.println("no is even");
	}
	else
	{
		System.out.println("no is odd");
	}
	
    
	}

}