package com.practice.rajtraining;

import com.practice.rajtraining.collection.ClassDetails;
import com.practice.rajtraining.collection.Marks;
import com.practice.rajtraining.collection.Mixture;
import com.practice.rajtraining.collection.Student;
import com.practice.rajtraining.collection.StudentDetails;
import java.util.ArrayList;

public class StudentMain {

    public static void main(String[] args) {
        ArrayList<Mixture> list = new ArrayList<>();
        Mixture m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("MTH");
        m1.setMarks(75);

        list.add(m1);
        list.add(m1);
        list.add(m1);
        list.add(m1);
        list.add(m1);
        list.add(m1);
        list.add(m1);
        list.add(m1);
        list.add(m1);
        list.add(m1);

        int stud_id;
        String stud_name;
        String mobile;
        String subject;
        int marks;

        

        StudentDetails sd = new StudentDetails();
        Marks mark = new Marks();
        ClassDetails cd = new ClassDetails();
        Student s = new Student();

        for (Mixture m : list) {
            stud_id = m.getStud_id();
            sd.setStud_id(stud_id);
            System.out.println(sd.getClass() + ":      stud_id:   " + sd.getStud_id());

            mark.setStud_id(stud_id);
            cd.setStud_id(stud_id);
            System.out.println(cd.getClass() + ":      stud_id:   " + cd.getStud_id());

            stud_name = m.getStud_name();
            s.setName(stud_name);
            System.out.println(s.getClass() + ":       stud_name:   " + s.getName());

            mobile = m.getMobile();
            sd.setMobile(mobile);
            System.out.println(sd.getClass() + ":      stud_mobile:   " + sd.getMobile());

            subject = m.getSubject();
            mark.setSubject(subject);
            System.out.println(mark.getClass() + ":     studsub:    " + mark.getSubject());

            marks = m.getMarks();
            mark.setMarks(marks);
            System.out.println(mark.getClass() + ":     stud_marks:    " + mark.getMarks());
            System.out.println("");

        }
    }
}
