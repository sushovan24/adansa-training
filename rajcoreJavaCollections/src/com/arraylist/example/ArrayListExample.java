package com.arraylist.example;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("shyam");
        list1.add(8);
        list1.add(5);
        list1.add("sonu");

        System.out.println(list1);
        System.out.println("indexOf: " + list1.indexOf(3));
        System.out.println("contains: " + list1.contains(5));
        System.out.println("before remove size: " + list1.size());
        System.out.println("remove: " + list1.remove(0));
        System.out.println("after remove size: " + list1.size());
        System.out.println("set: "+list1.set(1, "raj"));
        System.out.println(list1); 
        System.out.println("");
        
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(5);
        list2.add(40);
        list2.add(23);
        System.out.println(list2);
        list2.addAll(list1);
        System.out.println(list2);
                
    }
}
