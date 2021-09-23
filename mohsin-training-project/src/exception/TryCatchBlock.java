/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;
import java.util.Scanner;
public class TryCatchBlock {
    public static void main(String[] args) {
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
    

