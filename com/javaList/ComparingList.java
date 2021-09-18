package com.javaList;

import java.util.List;
import java.util.ArrayList;

public class ComparingList {

    public static void main(String[] args) {

        List list1 = new ArrayList<>();

        list1.add("banana");
        list1.add("apple");
        list1.add("mango");
        list1.add("lemon");
        list1.add("grapes");

        List list2 = new ArrayList<>();

        list2.add("banana");
        list2.add("apple");
        list2.add("lemon");
        list2.add("grapes");

        //list1.removeAll(list2);
        System.out.println(list1);
        //list1.retainAll(list2);

        List list3 = new ArrayList<>();
        for (Object s : list1) {
            list3.add(list1.contains(list2) ? "yes" : "no");

        }
        System.out.println(list3);
    }
}
