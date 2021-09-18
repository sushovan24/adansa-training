package com.array;

import java.util.Scanner;

public class CompareArray {

    public static void main(String[] args) {

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

        System.out.println();
        System.out.println("common array will be...");
        int temp;
        for (int i = 0; i < arr1.length; i++) {
            temp = arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (temp == arr2[j]) {
                    System.out.print(temp + "\t");
                }
            }
        }

        System.out.println();
        System.out.println("present in array1 but not in array 2");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    break;
                }

                if (arr1[i] != arr2[j] && j == arr2.length-1) {
                    System.out.print(arr1[i]+"\t");
                }
            }
        }

        System.out.println();
        System.out.println("present in array2 but not in array 1");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {

                if (arr2[i] == arr1[j]) {
                    break;
                }

                if (arr2[i] != arr1[j] && j == arr1.length-1) {
                   
                System.out.print(arr2[i] + "\t");
                    
                }
            }

        }

    }
}
