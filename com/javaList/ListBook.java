package com.javaList;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListBook {
    
    int id;
    String name;
    int price;
    
    ListBook(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public static void main(String[] args) {
        List<ListBook> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("how many books you want to enter");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("enter details for list "+i+1);
            System.out.println("enter id");
            int id = sc.nextInt();
            
            System.out.println("enter name");
            String name = sc.next();
            
            System.out.println("enter price");
            int price = sc.nextInt();
            
            ListBook b1 = new ListBook(id, name, price);
            
            list.add(b1);
        }
        
       
        for(ListBook b:list){
            System.out.println("details of "+b.id);
            System.out.println(b.id+" "+b.name+" "+b.price);
        }
        
        List list2 = new ArrayList<>();
        
        boolean result = list.equals(list2);
        System.out.println(result);
    }
}
