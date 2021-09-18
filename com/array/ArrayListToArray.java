package com.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println("this is array list");
        System.out.println(list);

        String[] num = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            num[i] = list.get(i);
        }

        System.out.println("");
        System.out.println("converting arraylist to array");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("");
        System.out.println("enter array value");
        String[] fruit = new String[5];
        for (int i = 0; i < 5; i++) {
            fruit[i] = sc.next();
        }

        System.out.println("");
        System.out.println("this is array values");
        for (int i = 0; i < 5; i++) {
            System.out.println(fruit[i]);
        }

        System.out.println("");
        System.out.println("converting array to arralist");
        ArrayList<String> fruitlist = new ArrayList<>();
        for (int i = 0; i < fruit.length; i++) {
            fruitlist.add(fruit[i]);
        }

        System.out.println(fruitlist);
    }
}
