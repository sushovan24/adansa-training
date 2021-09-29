/*Convert ArrayList to HashMap
HashMap<Integer, Student> Id(Integer) should be unique
HashMap<Integer, List<Student>> Id(should not be unique)
     */


package com.practice.mohsintraining.arraytohashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ArrayListToHashMap {

    private Student s;
    private int sid;
    private int age;
    private String sname;
    private ArrayList<Student> list = new ArrayList<>();
    private ArrayList<Student> list1 = new ArrayList<>();
    private ArrayList<Student> list2 = new ArrayList<>();
    private ArrayList<Student> List3 = new ArrayList<>();
    private HashMap<Integer, List<Student>> map1 = new HashMap<>();

    public void setData() {
        s = new Student();
        s.setId(101);
        s.setName("ram");
        s.setAge(23);
        list.add(s);

        s = new Student();
        s.setId(102);
        s.setName("dinga");
        s.setAge(24);
        list.add(s);

        s = new Student();
        s.setId(103);
        s.setName("dingi");
        s.setAge(25);
        list.add(s);
        
        s = new Student();
        s.setId(104);
        s.setName("dingi");
        s.setAge(27);
        list.add(s);
        
        s = new Student();
        s.setId(105);
        s.setName("chinga");
        s.setAge(24);
        list.add(s);
        
        s = new Student();
        s.setId(106);
        s.setName("chingi");
        s.setAge(26);
        list.add(s);
        
        
       
// arraylist to hashmap conversion
        arrayListToHashmap(list);

        s = new Student();
        s.setId(201);
        s.setName("jinga");
        s.setAge(30);
        list1.add(s);

        s = new Student();
        s.setId(202);
        s.setName("jingi");
        s.setAge(31);
        list1.add(s);

        s = new Student();
        s.setId(203);
        s.setName("minga");
        s.setAge(32);
        list1.add(s);

        s = new Student();
        s.setId(204);
        s.setName("mingi");
        s.setAge(34);
        list1.add(s);

        s = new Student();
        s.setId(205);
        s.setName("pinga");
        s.setAge(35);
        list1.add(s);
        listOfStudentList(list, list1, list2);
    }

    public void arrayListToHashmap(ArrayList<Student> list) {
        HashMap<Integer, Student> map = new HashMap<>();
        for (Student sdata : list) {
            sid = sdata.getId();
            map.put(sid, sdata);
        }

        printStudentHashMap(map);
    }

    public void listOfStudentList(List<Student> list1, List<Student> list2, List<Student> list3) {
        map1.put(301, list1);
        map1.put(302, list2);
        map1.put(303, list3);

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

    
    
    

