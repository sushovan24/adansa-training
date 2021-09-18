
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author PANDIT
 */
public class CompareArrayHashMap {
    
    public static void main(String[] args){
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array first");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter array second");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("first array will be");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        System.out.println();
        System.out.println("second array will be");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
        }

       

        HashSet<Integer> s=new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            s.add(arr1[i]);
        }
        
        HashSet<Integer> s1 = new HashSet<>();
        for(int i=0; i<arr2.length; i++){
            s1.add(arr2[i]);
        }
        
        System.out.println();
        System.out.println("Array2 element that not present in array 1");
        for(int i=0; i<arr2.length; i++){
            if(!s.contains(arr2[i])){
                System.out.print(arr2[i]+"\t");
            }
        }
        
        System.out.println();
        System.out.println("Array1 element that not present in array2");
        for(int i=0; i<arr1.length; i++){
            if(!s1.contains(arr1[i])){
                System.out.print(arr1[i]+"\t");
            }
        }
        
    }
}
