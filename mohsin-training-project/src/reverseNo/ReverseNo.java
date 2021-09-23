//import java.util.Scanner;
package reverseNo;
public class ReverseNo {
 public static void main(String args [ ])
 {
 int num=123,rev=0,rem;
 while(num>0)
 {
 rem=num%10;
 num=num/10;
 rev=rev*10+rem;
 }
 System.out.println("Reverse of num is : "+rev);
 }
 }
