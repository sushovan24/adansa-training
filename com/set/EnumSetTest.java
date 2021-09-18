package com.set;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
    SUNDAY, MONDAY, TUESDAY, WEDNESSDAY, THIRSDAY, FRIDAY, SATURDAY
};

public class EnumSetTest {

    public static void main(String[] args) {
        Set<days> set = EnumSet.of(days.FRIDAY,days.MONDAY);
        
        Iterator<days> itr=set.iterator();//name email 
        while(itr.hasNext()){
            System.out.println(" "+itr.next());
        }
        
        System.out.println("");
        System.out.println("another ");
        System.out.println("");
        Set<days> set1 = EnumSet.allOf(days.class);
        itr=set1.iterator();
        while(itr.hasNext()){
            System.out.println(" " + itr.next());
        }
        
        Set<days>set2 = EnumSet.noneOf(days.class);
        itr = set2.iterator();
        while(itr.hasNext()){
            System.out.println("Days is: "+itr.next());
        }
    }
}
