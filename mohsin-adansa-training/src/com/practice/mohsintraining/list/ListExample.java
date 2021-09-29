/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.mohsintraining.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Md mohsin alam
 */
public class ListExample {
    
    public void listData(){
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        
        printList(list);
    }
    
    public void printList(List<Integer> list){
        for(Integer s:list){
            System.out.println(s);
        }
    }
}
