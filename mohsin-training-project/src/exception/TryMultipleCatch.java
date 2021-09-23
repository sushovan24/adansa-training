
package exception;
import java.util.Scanner;
public class TryMultipleCatch {
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
    catch(Exception  e)
    {
    	System.out.println("kindly inform you please dont divided by 0 or b");
    }
    //System.out.println("arthimaticsException");
	}

}

    

