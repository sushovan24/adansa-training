package com.Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Students implements Comparable<Students> {

    int id;
    String name;
    int age;

    Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Students st) {
        if (age == st.age) {
            return 0;
        } else if (age > st.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class CaomparableExample {

    public static void main(String[] args) {

        ArrayList<Students> lists = new ArrayList<>();
        System.out.println("how many student you want to add");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sid;
        String sname;
        int sage;
        for (int i = 0; i < n; i++) {
            sid = sc.nextInt();
            sname = sc.next();
            sage = sc.nextInt();

            lists.add(new Students(sid, sname, sage));
        }

        System.out.println("sorted by age ");
        System.out.println("");
        Collections.sort(lists);
        for (Students s : lists) {
            System.out.println(s.id+" "+s.name+" "+s.age);
        }
    }
}
