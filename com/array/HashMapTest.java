
package com.array;
import java.util.*;
import java.util.function.BiFunction;

public class HashMapTest {
   
    public static void main(String[] args) {
       HashMap<Integer,String> map =new HashMap<>();
       map.put(1, "one");
       map.put(2, "two");
       map.put(3, "three");
       map.put(4, "four");
       map.put(5, "five");
       map.put(6, "six");
       map.put(7, "seven");
       map.put(8, "eight");
       
       map.entrySet().forEach((m) -> {
           System.out.println(m.getKey() + " " + m.getValue());
        });
       
        System.out.println("");
        System.out.println("After using function putIfAbsent");
       map.putIfAbsent(9, "nine");
       
       map.entrySet().forEach((m)->{
           System.out.println(m.getKey() +" "+ m.getValue());
       });
       
        System.out.println("");
        System.out.println("Another HashMap");

       HashMap<Integer,String> hm = new HashMap<>();
       hm.put(10, "ten");
       
       hm.entrySet().forEach((m)->{
           System.out.println(m.getKey()+" "+m.getValue());
       });
       
        System.out.println("");
        System.out.println("merging the both map");
        map.putAll(hm);
        
        map.entrySet().forEach((m)->{
            System.out.println(m.getKey()+" "+m.getValue());
        });
        
        map.remove(9);
        
        System.out.println("");
        System.out.println("printing map after clear function");
       // map.clear();
        map.entrySet().forEach((m)->{
            System.out.println(m.getKey()+" "+m.getValue());
        });
        
        map.remove(10);
        System.out.println(""+ map);
        
        map.replace(8, "nine");
        System.out.println("" +map);
        
        map.replace(8, "nine", "eight");
        System.out.println(""+map);
        
        map.replaceAll((k,v)->"raj");
        System.out.println(""+map);
        
        Iterator <Integer> itr=map.keySet().iterator();
        while(itr.hasNext()){
            int key=itr.next();
            System.out.println(key +" "+ map.get(key));
        }
        
        for(Integer num:map.keySet()){
            System.out.println(num+"");
        }
        
        for(String val:map.values()){
            System.out.println(val+"");
        }
    }
}
