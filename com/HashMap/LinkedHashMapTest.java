/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author PANDIT
 */
public class LinkedHashMapTest {
    
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
        hm.put(1, "one");
        hm.put(2, "two");
        
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+ " " +m.getValue());
        }
           
        System.out.println(" "+hm.keySet());
        System.out.println(" "+hm.values());
        System.out.println(" "+hm.entrySet());
        boolean b = hm.isEmpty();
        System.out.println(" "+b);
    }
}
