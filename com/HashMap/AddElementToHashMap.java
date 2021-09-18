package com.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddElementToHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("how many data you want to add");
        int data = sc.nextInt();

        System.out.println("enter key and value for..");
        for (int i = 0; i < data; i++) {

            int key = sc.nextInt();
            String val = sc.next();
            map.put(key, val);
        }

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("enter the key and value you want to replace");
        int newkey = sc.nextInt();
        String newval = sc.next();
        map.replace(newkey, newval);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("do you want to change the value if key and value match");
        System.out.println("enter key, oldvalue and newvalue");

        int spkey = sc.nextInt();
        String oldval = sc.next();
        String spval = sc.next();
        map.replace(spkey, oldval, spval);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("do you want to remove the specific vale enter key and value");
        int remkey = sc.nextInt();
        String remval = sc.next();
        map.remove(remkey, remval);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("do you want to remove value by key");
        int remvalbykey = sc.nextInt();
        map.remove(remvalbykey);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("do u wnt to get object, please enter key");
        int getobj = sc.nextInt();
        System.out.println(map.get(getobj));

        System.out.println("key is.. " + map.keySet());

        System.out.println("entry set is.. " + map.entrySet());

        System.out.println("to chek if value is exist or not please enter value");
        String existval = sc.next();
        System.out.println(" " + map.containsValue(existval));

        System.out.println("to chek if key is exist or not please enter key");
        int existkey = sc.nextInt();
        System.out.println(" " + map.containsKey(existkey));

        System.out.println("enter the key and value map will add if key value doesn't exist");
        int abkey = sc.nextInt();
        String abval = sc.next();
        map.putIfAbsent(abkey, abval);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("if you want to add new key value, please enter key and value");
        int nkey = sc.nextInt();
        String nval = sc.next();
        map.put(nkey, nval);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //creating another hashmap
        System.out.println("add key value to new hashmap");
        HashMap<Integer, String> map1 = new HashMap<>();
        System.out.println("how many element do u want to add");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String val = sc.next();
            map1.put(key, val);
        }

        for (Map.Entry m : map1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("After nerging the both hashmap");
        map.putAll(map1);

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("after clearing the map");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
