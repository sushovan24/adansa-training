
package com.rajmaven.list;

import com.rajmaven.help.Help;
import java.util.ArrayList;
import java.util.List;


public class TestList {
   List<Integer> list1=new ArrayList<>();
    public void insertIntoList(int data){
        list1.add(data);
        
        Help p=new Help();
        p.printList(list1);
    }
}
