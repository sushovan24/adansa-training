package com.practice.rajtraining.arraytohashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayListToHashMap {

    Student s;
    int sid;
    String sname;
    ArrayList<Student> list = new ArrayList<>();
    ArrayList<Student> list1 = new ArrayList<>();
    ArrayList<Student> list2 = new ArrayList<>();
    HashMap<Integer, List<Student>> map1 = new HashMap<>();

    public void setData() {
        s = new Student();
        s.setId(101);
        s.setName("raj");
        list.add(s);

        s = new Student();
        s.setId(102);
        s.setName("monu");
        list.add(s);

        s = new Student();
        s.setId(103);
        s.setName("sonu");
        list.add(s);

        s = new Student();
        s.setId(104);
        s.setName("tonny");
        list.add(s);

        s = new Student();
        s.setId(105);
        s.setName("moni");
        list.add(s);

        arrayListToHashmap(list);

        s = new Student();
        s.setId(201);
        s.setName("pappu");
        list1.add(s);

        s = new Student();
        s.setId(202);
        s.setName("shivam");
        list1.add(s);

        s = new Student();
        s.setId(201);
        s.setName("manmohan");
        list1.add(s);

        s = new Student();
        s.setId(301);
        s.setName("migdha");
        list2.add(s);

        s = new Student();
        s.setId(302);
        s.setName("renu");
        list2.add(s);

        s = new Student();
        s.setId(303);
        s.setName("anshu");
        list2.add(s);

        listOfStudentList(list, list1, list2);
    }

    /*
        
        Convert ArrayList to HashMap
HashMap<Integer, Student> Id(Integer) should be unique
HashMap<Integer, List<Student>> Id(should not be unique)
     */
    public void arrayListToHashmap(ArrayList<Student> list) {
        HashMap<Integer, Student> map = new HashMap<>();
        for (Student sdata : list) {
            sid = sdata.getId();
            map.put(sid, sdata);
        }

        printStudentHashMap(map);
    }

    public void listOfStudentList(List<Student> list1, List<Student> list2, List<Student> list3) {
        map1.put(501, list1);
        map1.put(502, list2);
        map1.put(503, list3);

        printStudentListHashMap(map1);
    }

    public void printStudentHashMap(HashMap<Integer, Student> map) {
        System.out.println("HashMap<Integer, Student> Id(Integer) should be unique");
        for (Map.Entry entry : map.entrySet()) {
            System.out.print(entry.getKey() + " ");
            s = new Student();
            s = (Student) entry.getValue();
            System.out.println(s.getId() + "  " + s.getName());
        }
        System.out.println("");
    }

    public void printStudentListHashMap(HashMap<Integer, List<Student>> map) {
        System.out.println("HashMap<Integer, List<Student>> Id(should not be unique)");
        for (Map.Entry entry : map.entrySet()) {
            ArrayList<Student> templist = new ArrayList<>();
            templist = (ArrayList<Student>) entry.getValue();
            System.out.print("id:" + entry.getKey() + " ");
            System.out.println("");
            for (Student data : templist) {
                System.out.println(data.getId() + "   " + data.getName());
            }
        }

        System.out.println("");
    }
}
