
package com.array;

import java.util.Scanner;


public class SumOfArrayElement {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[] = new int[n];
        
        System.out.println("");
        System.out.println("enetr array");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        
        int sum=0;
//        for(int i=0; i<arr1.length; i++){
//            sum=sum+arr1[i];
//        }
//        
//        System.out.println("");
//        System.out.println("total sum is.." +sum);
    
        for(int num:arr1){
            sum=sum+num;
        }
        
        System.out.println("sum of all element is..."+ sum);
    }
}
