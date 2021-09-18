package Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayToArrayList {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         //array to arraylist
        System.out.println("enter array element");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> alist = new ArrayList<>();
        for (Integer in : arr) {
            alist.add(in);
        }

        Collections.sort(alist);
        System.out.println(alist);

        
        //arraylist to array
        ArrayList<Integer> arlist = new ArrayList<>();
        System.out.println("how many element you want to add into arraylist");
        int element = sc.nextInt();
        for (int i = 0; i < element; i++) {
            int data = sc.nextInt();
            arlist.add(data);
        }

        
        int arr2[] = new int[arlist.size()];
        for(int i=0; i<arlist.size(); i++){
            arr2[i]=arlist.get(i);
        }
        
        for(int i=0; i<arr2.length; i++){
            System.out.println(" "+arr2[i]);
        }
        
        
    }
}
