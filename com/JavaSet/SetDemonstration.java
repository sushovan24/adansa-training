package com.JavaSet;

import java.util.HashSet;
import java.util.Set;

public class SetDemonstration {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);

        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(7);
        set1.add(5);
        set1.add(10);
        set1.add(9);
        set1.add(8);

        //perform intersection
        Set<Integer> intersection = new HashSet<>(set);
        intersection.retainAll(set1);
        System.out.println(intersection);

        //perform ubion
        Set<Integer> union = new HashSet<>(set);
        union.addAll(set1);
        System.out.println(union);

        //perform difference
        Set<Integer> difference = new HashSet(set);
        difference.removeAll(set1);
        System.out.println(difference);

    }
}
