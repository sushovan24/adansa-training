package com.practice.rajtraining.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

    public void comparatorExample() {
        ArrayList<Person> list = new ArrayList<>();
        Person p = new Person();
        p.setId(101);
        p.setName("raj");
        p.setAge(21);
        list.add(p);

        p = new Person();
        p.setId(102);
        p.setName("raju");
        p.setAge(40);
        list.add(p);

        p = new Person();
        p.setId(103);
        p.setName("rajesh");
        p.setAge(20);
        list.add(p);

        p = new Person();
        p.setId(104);
        p.setName("shivam");
        p.setAge(22);
        list.add(p);

        p = new Person();
        p.setId(105);
        p.setName("manmohan");
        p.setAge(23);
        list.add(p);

        p = new Person();
        p.setId(106);
        p.setName("sonu");
        p.setAge(24);
        list.add(p);

        Collections.sort(list, new AgeCompare());
        System.out.println("id  name    age");
        for (Person person : list) {
            System.out.println(person.getId() + " " + person.getName() + "    " + person.getAge());
        }

        System.out.println("");
        Collections.sort(list, new NameCompare());
        System.out.println("id  name    age");
        for (Person person : list) {
            System.out.println(person.getId() + " " + person.getName() + "    " + person.getAge());
        }
    }
}
