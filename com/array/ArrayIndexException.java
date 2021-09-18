
package com.array;

import java.util.Scanner;


public class ArrayIndexException {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("enter the index for find the associated value");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        try{
            System.out.println("value of index "+n+" is "+ arr[n]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("please enter the index less then "+ arr.length);
        }
        
    }
}
