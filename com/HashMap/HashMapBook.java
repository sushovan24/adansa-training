
package com.HashMap;

import java.util.HashMap;
import java.util.Map;


public class HashMapBook {
    
    int id;
    String name,author,publisher;
    int quantity;
    
    HashMapBook(int id, String name, String author, String publisher, int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
    
    public static void main(String[]args){
        Map<Integer,HashMapBook> map=new HashMap<>();
        HashMapBook b1=new HashMapBook(1,"basic grammer","k.c singha","arihant",3);
        HashMapBook b2=new HashMapBook(2,"basic c","amit mishra","katson",5);
        
        map.put(1, b1);
        map.put(2, b2);
        
        for(Map.Entry<Integer,HashMapBook> entry:map.entrySet()){
            int key = entry.getKey();
            HashMapBook b=entry.getValue();
            
            System.out.println(key+" details");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
