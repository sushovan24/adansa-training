
// WAP to sum of array element (total element sum)
//import java.util.Scanner;// if we use take a data from user
package com.practice.mohsintraining.sumofarray;
public class SumOfArray {
    
    public static void sumofarray() {
		int[] arr=new int[] {1,8,0,7};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of elemt"+sum);

	}

}

