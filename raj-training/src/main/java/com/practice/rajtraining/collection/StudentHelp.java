package com.practice.rajtraining.collection;

import java.util.ArrayList;

public class StudentHelp {

    int stud_id;
    String stud_name;
    String mobile;
    String subject;
    int marks;

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Marks> marksList = new ArrayList<>();
    ArrayList<StudentDetails> sdList = new ArrayList<>();
    ArrayList<ClassDetails> cdList = new ArrayList<>();

    StudentDetails sd = new StudentDetails();
    Marks mark = new Marks();
    ClassDetails cd = new ClassDetails();
    Student s = new Student();

    public void mixtureList() {
        ArrayList<Mixture> list = new ArrayList<>();
        Mixture m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("MTH");
        m1.setMarks(75);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(101);
        m1.setStud_name("rohan");
        m1.setMobile("9852362500");
        m1.setSubject("PHY");
        m1.setMarks(45);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(102);
        m1.setStud_name("rohit");
        m1.setMobile("9852368956");
        m1.setSubject("CHE");
        m1.setMarks(49);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(103);
        m1.setStud_name("raju");
        m1.setMobile("586968956");
        m1.setSubject("HND");
        m1.setMarks(65);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(104);
        m1.setStud_name("roshan");
        m1.setMobile("9851234956");
        m1.setSubject("snk");
        m1.setMarks(55);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(105);
        m1.setStud_name("pappu");
        m1.setMobile("7562088722");
        m1.setSubject("DSA");
        m1.setMarks(60);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(106);
        m1.setStud_name("jagriti");
        m1.setMobile("8745632154");
        m1.setSubject("Ecology");
        m1.setMarks(68);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(107);
        m1.setStud_name("shivam");
        m1.setMobile("8480132415");
        m1.setSubject("ENG");
        m1.setMarks(80);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(108);
        m1.setStud_name("aditya");
        m1.setMobile("6932456874");
        m1.setSubject("BIO");
        m1.setMarks(85);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(109);
        m1.setStud_name("monu");
        m1.setMobile("8532145658");
        m1.setSubject("ACT");
        m1.setMarks(78);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(110);
        m1.setStud_name("sonu");
        m1.setMobile("9523246185");
        m1.setSubject("SSC");
        m1.setMarks(75);
        list.add(m1);

        display(list);
    }

    public void display(ArrayList<Mixture> list) {

        for (Mixture m : list) {
            stud_id = m.getStud_id();
            stud_name = m.getStud_name();
            mobile = m.getMobile();
            subject = m.getSubject();
            marks = m.getMarks();

            System.out.println(m.getMobile()+"");
            s.setId(stud_id);
            s.setName(stud_name);
            studentList.add(s);

            mark.setStud_id(stud_id);
            mark.setMarks(marks);
            mark.setSubject(subject);
            marksList.add(mark);

            sd.setStud_id(stud_id);
            sd.setMobile(mobile);
            sdList.add(sd);

            cd.setStud_id(stud_id);
            cdList.add(cd);

        }

        printStudent(studentList);
        printMarks(marksList);
        printStudentDetails(sdList);
        printClassDetails(cdList);

    }

    public void printStudent(ArrayList<Student> list) {
        System.out.println("student..........");
        System.out.println(" id        name");
        for (Student sl : list) {
            System.out.println(sl.getId() + "         " + sl.getName());
        }
        System.out.println("");
    }

    public void printMarks(ArrayList<Marks> list) {
        System.out.println("marks............");
        System.out.println("stud_id      subject       marks");
        for (Marks m : list) {
            System.out.println(m.getStud_id() + "       " + m.getSubject() + "      " + m.getMarks());
        }
        System.out.println("");
    }

    public void printStudentDetails(ArrayList<StudentDetails> list) {
        System.out.println("studentdetails............");
        System.out.println("student_id     student_mobile");
        for (StudentDetails sd : list) {
            System.out.println(sd.getStud_id() + "         " + sd.getMobile());
        }
        System.out.println("");
    }

    public void printClassDetails(ArrayList<ClassDetails> list) {
        System.out.println("ClassDetails............");
        System.out.println("student_id");
        for (ClassDetails cd : list) {
            System.out.println(cd.getStud_id());
        }
        System.out.println("");
    }
}
