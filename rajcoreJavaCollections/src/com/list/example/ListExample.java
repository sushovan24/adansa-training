
package com.list.example;

import java.util.ArrayList;
import java.util.List;


public class ListExample {
    
    public static void main(String[] args) {
        List list1=new ArrayList();
        list1.add("ram");
        list1.add(1);
        list1.add(8);
        list1.add("sonu");
        
        System.out.println(list1);
        System.out.println("indexOf: "+list1.indexOf(2));
        System.out.println("set: "+list1.set(0, "mohan"));
        System.out.println(list1); 
        System.out.println("contains: "+list1.contains(8));
        System.out.println(""+list1.size());
        System.out.println(list1.remove(3));
        System.out.println("size: "+list1.size());
            
    }
}
