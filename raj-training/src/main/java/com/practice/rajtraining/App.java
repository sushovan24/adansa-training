package com.practice.rajtraining;

import com.practice.rajtraining.arraytohashmap.ArrayListToHashMap;
import com.practice.rajtraining.bigdecimal.BigDecimalExample;
import com.practice.rajtraining.collection.StudentHelp;
import com.practice.rajtraining.comparable.ComparableExample;
import com.practice.rajtraining.comparator.ComparatorExample;
import com.practice.rajtraining.datetime.DateHelp;
import com.practice.rajtraining.exception.ThrowException;
import com.practice.rajtraining.listcompare.ListCompare;
import com.practice.rajtraining.randomnumbergenerate.RandomNum;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class App {

    public static void main(String[] args) throws ParseException{
//        StudentHelp s = new StudentHelp();
//        s.mixtureList();
//        System.out.println("");
//
//        DateHelp dt = new DateHelp();
//        dt.InputDate();
//        System.out.println("");
//
//        ListCompare compare = new ListCompare();
//        compare.listCompare();
//        System.out.println("");
//
//        ComparatorExample comparator = new ComparatorExample();
//        comparator.comparatorExample();
//        System.out.println("");
//
//        ComparableExample cp = new ComparableExample();
//        cp.comparable();
//
//        ArrayListToHashMap hmap = new ArrayListToHashMap();
//        hmap.setData();
//
//        RandomNum rn = new RandomNum();
//        rn.getRandomDetails();

//          ThrowException texp = new ThrowException();
//          try{
//               texp.checkForVote();
//          }catch(FileNotFoundException ex){
//              System.out.println(ex);
//              System.out.println("file not found");
//          }catch(ArithmeticException ex){
//              System.out.println(ex);
//              System.out.println("not eligible for vote");
//          }
         

        BigDecimalExample bde = new BigDecimalExample();
        bde.bigDecimalExample();
    }
}
