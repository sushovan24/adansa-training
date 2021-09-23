package com.practice.rajtraining.collection;

import java.util.ArrayList;

public class StudentHelp {

    int stud_id;
    String stud_name;
    String mobile;
    String subject;
    int marks;

    public void mixtureList() {
        ArrayList<Mixture> list = new ArrayList<>();
        Mixture m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("MTH");
        m1.setMarks(75);

        m1=new Mixture();
        m1.setStud_id(101);
        m1.setStud_name("rohan");
        m1.setMobile("9852362500");
        m1.setSubject("PHY");
        m1.setMarks(45);
        
        m1=new Mixture();
        m1.setStud_id(102);
        m1.setStud_name("rohit");
        m1.setMobile("9852368956");
        m1.setSubject("CHE");
        m1.setMarks(49);
        
        m1=new Mixture();
        m1.setStud_id(103);
        m1.setStud_name("raju");
        m1.setMobile("586968956");
        m1.setSubject("HND");
        m1.setMarks(65);
        
        m1=new Mixture();
        m1.setStud_id(104);
        m1.setStud_name("roshan");
        m1.setMobile("9851234956");
        m1.setSubject("snk");
        m1.setMarks(55);
        
        m1=new Mixture();
        m1.setStud_id(105);
        m1.setStud_name("pappu");
        m1.setMobile("7562088722");
        m1.setSubject("DSA");
        m1.setMarks(60);
        
        m1=new Mixture();
        m1.setStud_id(106);
        m1.setStud_name("jagriti");
        m1.setMobile("8745632154");
        m1.setSubject("Ecology");
        m1.setMarks(68);
        
        m1=new Mixture();
        m1.setStud_id(107);
        m1.setStud_name("shivam");
        m1.setMobile("8480132415");
        m1.setSubject("ENG");
        m1.setMarks(80);
        
        m1=new Mixture();
        m1.setStud_id(108);
        m1.setStud_name("aditya");
        m1.setMobile("6932456874");
        m1.setSubject("BIO");
        m1.setMarks(85);
        
        m1=new Mixture();
        m1.setStud_id(109);
        m1.setStud_name("monu");
        m1.setMobile("8532145658");
        m1.setSubject("ACT");
        m1.setMarks(78);
        
        m1=new Mixture();
        m1.setStud_id(110);
        m1.setStud_name("sonu");
        m1.setMobile("9523246185");
        m1.setSubject("SSC");
        m1.setMarks(75);
        
        list.add(m1);
        

        display(list);
    }

    public void display(ArrayList<Mixture> list) {
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
