/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenOddNo;
import java.util.Scanner;
public class EvenOddNo {
    // even and odd no program
	public static void main(String[] args) {
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

    

