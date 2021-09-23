/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumOfArray;

public class SumOfEachSqureNo {
    
    // add each element squre sum
	public static void main(String[] args) {

		int num=125;
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;

			sum = sum + (rem * rem);
			num = num / 10;
		}
		System.out.println("sum of indivisual digit:" +  sum);
	}

}

    

