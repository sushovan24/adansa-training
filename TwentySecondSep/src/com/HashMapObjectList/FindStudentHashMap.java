package com.HashMapObjectList;

import com.entity.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindStudentHashMap {

    public static void main(String[] args) {
        
        //map<Integer,Student>
        HashMap<Integer, Student> map = new HashMap<>();

        
        map.put(11, new Student(11, "monu"));
        map.put(12, new Student(12, "sonu"));
        map.put(13, new Student(13, "john"));

        //get method
        Student st = map.get(11);
        System.out.println(st.getId() + " " + st.getName());
        System.out.println("");

        //using entryset()
        for (Map.Entry entry : map.entrySet()) {
            Student s = (Student) entry.getValue();
            System.out.println("key: " + entry.getKey() + " value: " + s.getId() + " " + s.getName());

        }
        System.out.println("");
        
        //map<Integer,List<Student>>
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "ram"));
        list1.add(new Student(2, "shyam"));
        list1.add(new Student(3, "aditya"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(4, "mohan"));
        list2.add(new Student(5, "sohan"));
        list2.add(new Student(6, "rohan"));
        
        List<Student> list3 = new ArrayList<>();
        list3.add(new Student(7, "raj"));
        list3.add(new Student(8, "jigyashu"));
        list3.add(new Student(9, "azad"));

        HashMap<Integer, List<Student>> map1 = new HashMap<>();
        map1.put(1, list1);
        map1.put(2, list2);
        map1.put(2, list3);

        for(Map.Entry entry:map1.entrySet()){
            System.out.println("key: "+entry.getKey());
            List<Student> templist=(List<Student>) entry.getValue();
            System.out.println("value will be");
            for(Student s:templist){
                System.out.println(s.getId()+" "+s.getName());
            }
            System.out.println("");
        }
    }
}
