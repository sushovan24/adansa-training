package com.practice.rajtraining.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class StudentHelp {

    int stud_id;
    String stud_name;
    String mobile;
    String subject;
    int marks;

    StudentDetails sd;//= new StudentDetails();
    Marks mark;//= new Marks();
    ClassDetails cd;// = new ClassDetails();
    Student s;// = new Student();

    public void mixtureList() {
        ArrayList<Mixture> list = new ArrayList<>();
        Mixture m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("MTH");
        m1.setMarks(75);
        list.add(m1);

        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("MTH");
        m1.setMarks(75);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("9852362500");
        m1.setSubject("PHY");
        m1.setMarks(45);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(102);
        m1.setStud_name("rohit");
        m1.setMobile("8298241734");
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
        m1.setStud_id(109);
        m1.setStud_name("monu");
        m1.setMobile("8532145658");
        m1.setSubject("ACT");
        m1.setMarks(78);
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
        m1.setMobile("7562088722");
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
        m1.setStud_id(108);
        m1.setStud_name("aditya");
        m1.setMobile("6932456874");
        m1.setSubject("BIO");
        m1.setMarks(85);
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
        m1.setSubject("SSC");
        m1.setMarks(75);
        list.add(m1);

        m1 = new Mixture();
        m1.setStud_id(109);
        m1.setStud_name("monu");
        m1.setMobile("8532145658");
        m1.setSubject("SSB");
        m1.setMarks(75);
        list.add(m1);

        display(list);
    }

    public void display(ArrayList<Mixture> list) {

        ArrayList<Marks> marksList = new ArrayList<>();
        ArrayList<StudentDetails> sdList = new ArrayList<>();
        HashMap<Integer, Student> studentmap = new HashMap<>();
        HashMap<Integer, ClassDetails> classmap = new HashMap<>();
        HashMap<Integer, ArrayList<StudentDetails>> stdmap = new HashMap<>();
        HashMap<Integer, ArrayList<Marks>> markmap = new HashMap<>();

        for (Mixture m : list) {
            stud_id = m.getStud_id();
            stud_name = m.getStud_name();
            mobile = m.getMobile();
            subject = m.getSubject();
            marks = m.getMarks();

            s = new Student();
            if (!studentmap.containsKey(stud_id)) {
                s.setId(stud_id);
                s.setName(stud_name);
                studentmap.put(stud_id, s);
            }

            mark = new Marks();
            setMarkRandomId();
            mark.setStud_id(stud_id);
            mark.setMarks(marks);
            mark.setSubject(subject);
            if (markmap.containsKey(stud_id)) {
                marksList = markmap.get(stud_id);
                boolean f = true;
                for (int i = 0; i < marksList.size(); i++) {
                    if (subject.equals(marksList.get(i).getSubject())) {
                        f = false;
                        break;
                    }
                }
                if (f) {
                    marksList.add(mark);
                    markmap.put(stud_id, marksList);
                }
            } else {
                marksList = new ArrayList<>();
                marksList.add(mark);
                markmap.put(stud_id, marksList);
            }

            sd = new StudentDetails();
            setStudentDetailsId();
            sd.setStud_id(stud_id);
            sd.setMobile(mobile);
            if (stdmap.containsKey(stud_id)) {
                sdList = stdmap.get(stud_id);
                boolean f = true;
                for (int j = 0; j < sdList.size(); j++) {
                    if (mobile.equals(sdList.get(j).getMobile())) {
                        f = false;
                        break;
                    }
                }
                if (f) {
                    sdList.add(sd);
                    stdmap.put(stud_id, sdList);
                }
            } else {
                sdList = new ArrayList<>();
                sdList.add(sd);
                stdmap.put(stud_id, sdList);
            }

            cd = new ClassDetails();
            if (!classmap.containsKey(stud_id)) {
                setClassDetailsId();
                cd.setStud_id(stud_id);
                classmap.put(stud_id, cd);
            }

        }

        printStudent(studentmap);
        printMarks(markmap);
        printStudentDetails(stdmap);
        printClassDetails(classmap);
    }

    public void printStudent(HashMap<Integer, Student> map) {
        System.out.println("student..........");
        System.out.println(" id    name");
        for (Map.Entry entry : map.entrySet()) {
            s = (Student) entry.getValue();
            System.out.println(s.getId() + "  " + s.getName());
        }

    }

    public void printMarks(HashMap<Integer, ArrayList<Marks>> map) {
        ArrayList<Marks> mList = new ArrayList<>();
        System.out.println("marks............");
        System.out.println("id     stud_id      subject       marks");
        Iterator itr = map.values().iterator();
        while (itr.hasNext()) {
            mList = (ArrayList<Marks>) itr.next();
            for (Marks mm : mList) {
                System.out.println(mm.getId() + "       " + mm.getStud_id() + "         " + mm.getSubject() + "         " + mm.getMarks());
            }
        }
    }

    public void printStudentDetails(HashMap<Integer, ArrayList<StudentDetails>> map) {
        ArrayList<StudentDetails> sdList = new ArrayList<>();
        System.out.println("studentdetails............");
        System.out.println("id  student_id  student_mobile");
        Iterator itr = map.values().iterator();
        while (itr.hasNext()) {
            sdList = (ArrayList<StudentDetails>) itr.next();
            for (StudentDetails std : sdList) {
                System.out.println(std.getId() + "    " + std.getStud_id() + "    " + std.getMobile());
            }
        }
    }

    public void printClassDetails(HashMap<Integer, ClassDetails> classmap) {
        System.out.println("ClassDetails............");
        System.out.println("id         student_id");
        for (Map.Entry entry : classmap.entrySet()) {
            cd = (ClassDetails) entry.getValue();
            System.out.println(cd.getId() + "         " + cd.getStud_id());
        }
    }

    Random r = new Random();

    public void setMarkRandomId() {
        int rand = r.nextInt(100);
        mark.setId(rand);
    }

    public void setClassDetailsId() {
        int rand = r.nextInt(200);
        cd.setId(rand);
    }

    public void setStudentDetailsId() {
        int rand = r.nextInt(300);
        sd.setId(rand);
    }

}
