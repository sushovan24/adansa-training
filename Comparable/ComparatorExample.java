package com.Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age == s1.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return -1;
        } else {
            return 1;
        }
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Student> list1 = new ArrayList<>();
        System.out.println("Enter how many data you want to add");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter id name age");

        int id;
        String name;
        int age;
        for (int i = 0; i < n; i++) {
            id = sc.nextInt();
            name = sc.next();
            age = sc.nextInt();

            list1.add(new Student(id, name, age));
        }

        System.out.println("");
        System.out.println("sorted by age");
        Collections.sort(list1, new AgeComparator());
        for (Student s : list1) {
            System.out.println(s.rollno + " " + s.name + " " + s.age);
        }

        System.out.println("");
        System.out.println("sorted by anme");
        Collections.sort(list1, new NameComparator());
        for (Student s : list1) {
            System.out.println(s.rollno + " " + s.name + " " + s.age);
        }
    }
}
