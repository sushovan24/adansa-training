/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HashMap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author PANDIT
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        
        System.out.println(" "+map);
        System.out.println(" "+map.hashCode());
        System.out.println(" "+map.headMap(3,true));
        System.out.println(" "+map.tailMap(1));
        System.out.println(" "+map.descendingMap());
        System.out.println(" "+map.containsKey(3));
        System.out.println(" "+map.navigableKeySet());
    }
}
