package Revision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many element you want to add");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter array element");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("enter the number by which you want to divide array");
            int div=sc.nextInt();
            int res[]=new int[arr.length];
            for(int i=0; i<arr.length; i++){
                res[i]= arr[i]/div;
            }
            
            for(int i=0; i<res.length;i++){
                System.out.println(res[i]);
            }
           
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("enetr only Integer value");
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("not input zero to divide");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Please Enter valid index");
        }
    }
}
