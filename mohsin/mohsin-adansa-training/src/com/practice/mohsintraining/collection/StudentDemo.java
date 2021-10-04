package com.practice.mohsintraining.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class StudentDemo {

    private int stud_id;
    private String stud_name;
    private String mobile;
    private String subject;
    private int marks;
    StudentDetails sd = new StudentDetails();//object creation;
    Marks mark = new Marks();
    ClassDetails cd = new ClassDetails();
    Student s = new Student();

    // method for mixturelist
    public void mixtureList() { //where is the closing brakate you don't know the concept of function
        ArrayList<Mixture> list = new ArrayList<>();
        Mixture m1 = new Mixture();
        m1.setStud_id(100);
        m1.setSubject("phy");
        m1.setMarkks(70);
        m1.setMobile("8965232145");
        m1.setName("papu");
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(100);
        m1.setSubject("phy");
        m1.setMarkks(70);
        m1.setMobile("8965232145");
        m1.setName("mohasin");
        list.add(m1);

        display(list);
    }

    // method for display    
    public void display(ArrayList<Mixture> list) {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Marks> marksList = new ArrayList<>();
        ArrayList<StudentDetails> sdList = new ArrayList<>();
        ArrayList<ClassDetails> cdList = new ArrayList<>();
        for (Mixture m : list) {
            stud_id = m.getStud_id();
            stud_name = m.getName();
            mobile = m.getMobile();
            marks = m.getMarkks();
            subject = m.getSubject();

            //setting student data in student class
            s = new Student();
            s.setId(stud_id);
            s.setName(stud_name);
            studentList.add(s);

            // setting marks details Marks class
            mark = new Marks();
            mark.setId(stud_id);
            mark.setStud_id(stud_id);
            mark.setMarks(marks);
            mark.setSubject(subject);
            marksList.add(mark);
            // StudentDetails for dtat in studentDetails class// isko list me add kon karega
            sd = new StudentDetails();
            sd.setId(stud_id);
            sd.setMobile(mobile);
            sdList.add(sd);
            // classDetails

            cd = new ClassDetails();

            cd.setId(stud_id);
            cd.setStud_id(stud_id);
            cd.setClassName(stud_name);
            cdList.add(cd);
            //setting student details in student details class
            // sd=new StudentDetails();
            printstudent(studentList);
            printmarks(marksList);
            printstudentDetails(sdList);
            printClassDetails(cdList);
        }

    }

    public void printstudent(ArrayList<Student> list) {
        for (Student sdd : list) {
            System.out.println(sdd.getId() + "    " + sdd.getName());
        }
    }

    public void printmarks(ArrayList<Marks> list) {
        for (Marks marr : list) {
            System.out.println(marr.getStud_id() + "  " + marr.getId() + "  " + marr.getSubject() + " " + marr.getRemarks() + " " + marr.getMarks());
        }
    }

    // studentdetails
    public void printstudentDetails(ArrayList<StudentDetails> list) {
        for (StudentDetails std : list) {
            System.out.println(std.getStu_id() + "  " + std.getMobile());
        }
    }

    // classDetails for display
    public void printClassDetails(ArrayList<ClassDetails> list) {
        for (ClassDetails cdd : list) {
            System.out.println(cdd.getClassName() + " " + cdd.getStud_id() +  " " + cdd.getId());
        }
    }
}

// ArrayList marks class yeh wala copy past hai
//copy nahi karna hai nahi to sikh nahi paiyega

//wah vo bhi class ke bahar paste kar diye the
