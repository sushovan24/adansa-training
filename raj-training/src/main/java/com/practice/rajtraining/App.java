package com.practice.rajtraining;

import com.practice.rajtraining.arraytohashmap.ArrayListToHashMap;
import com.practice.rajtraining.collection.StudentHelp;
import com.practice.rajtraining.comparable.ComparableExample;
import com.practice.rajtraining.comparator.ComparatorExample;
import com.practice.rajtraining.datetime.DateHelp;
import com.practice.rajtraining.listcompare.ListCompare;
import java.text.ParseException;

public class App {

    public static void main(String[] args) throws ParseException {
        StudentHelp s = new StudentHelp();
        s.mixtureList();
        System.out.println("");

        DateHelp dt = new DateHelp();
        dt.InputDate();
        System.out.println("");

        ListCompare compare = new ListCompare();
        compare.listCompare();
        System.out.println("");

        ComparatorExample comparator = new ComparatorExample();
        comparator.comparatorExample();
        System.out.println("");

        ComparableExample cp = new ComparableExample();
        cp.comparable();

        ArrayListToHashMap hmap = new ArrayListToHashMap();
        hmap.setData();
    }
}
