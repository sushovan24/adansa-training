
package com.array;

import java.util.Scanner;


public class CheckEvenOdd {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(n%2==0){
            System.out.println("it is even number");
        }else{
            System.out.println("it is odd number");
        }
    }
}
