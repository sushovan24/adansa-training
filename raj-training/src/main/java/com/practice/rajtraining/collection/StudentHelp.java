package com.practice.rajtraining.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

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
        
        /**Student details
         *  1. HashMap<Integer, List<StdentDetails>>
         *  2. Get from HM by StdentID 
         * ``if contains then 
         *      fetch list > check unique mobile number > if !unique then add it to list > put list to HM
         *  3. if !conatins then
         *      create a new list > add to list > put list to HM    
         */
        

        m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("9852362500");
        m1.setSubject("PHY");
        m1.setMarks(45);
        list.add(m1);
        
        
        m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("9852362500");
        m1.setSubject("CHEM");
        m1.setMarks(40);
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
        m1.setMobile("8532145653");
        m1.setSubject("SSB");
        m1.setMarks(75);
        list.add(m1);

        display(list);
    }

    public void display(ArrayList<Mixture> list) {
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Marks> marksList = new ArrayList<>();
        List<StudentDetails> sdList = new ArrayList<>();
        ArrayList<ClassDetails> cdList = new ArrayList<>();
        
        HashMap<Integer, List<StudentDetails>> stdDetMap = new HashMap<>();
        for (Mixture m : list) {
            stud_id = m.getStud_id();
            stud_name = m.getStud_name();
            String mobile = m.getMobile();
            subject = m.getSubject();
            marks = m.getMarks();

            s = new Student();

            s.setId(stud_id);
            s.setName(stud_name);
            studentList.add(s);

            mark = new Marks();
            setMarkRandomId();
            mark.setStud_id(stud_id);
            mark.setMarks(marks);
            mark.setSubject(subject);
            marksList.add(mark);
            
            sd = new StudentDetails();
            setStudentDetailsId();
            sd.setStud_id(stud_id);
            sd.setMobile(mobile);
            
            if(stdDetMap.containsKey(stud_id)){
                sdList = stdDetMap.get(stud_id);
                boolean flag = true;
                for (int j = 0; j < sdList.size(); j++) {
                    System.out.println("Stud Id==>"+stud_id+"  existMob=>"+mobile+"  MobList=>"+sdList); 
                   if(mobile.equals(sdList.get(j).getMobile())){
                       System.out.println("Mobile Matched"); 
                      flag = false; 
                      break; 
                   } 
                    
                }
                
                System.out.println("Flag==>"+flag);
                if(flag){
                    sdList.add(sd);
                    stdDetMap.put(stud_id, sdList);
                }
                
            }else{
                System.out.println("When New Student");
                sdList = new ArrayList<>();
                sdList.add(sd);
                stdDetMap.put(stud_id, sdList);
            }
            
            
            
            
//            sdList.add(sd);

            cd = new ClassDetails();
            setClassDetailsId();
            cd.setStud_id(stud_id);
            cdList.add(cd);

        }
        
        System.out.println("stdDetMap===>"+stdDetMap);

//        printStudent(studentList);
//        printMarks(marksList);
//        printStudentDetails(sdList);
//        printClassDetails(cdList);

    }

    int i;

    public void printStudent(ArrayList<Student> list) {
        HashMap<Integer, Student> map = new HashMap<>();
        for (Student ss : list) {
            if (!map.containsKey(ss.getId())) {
                map.put(ss.getId(), ss);
            }
        }

        System.out.println("student..........");
        System.out.println(" id    name");

        s = new Student();
        for (Map.Entry entry : map.entrySet()) {
            s = (Student) entry.getValue();
            System.out.println(s.getId() + "  " + s.getName());
        }

    }

    public void printMarks(List<Marks> list) {
        System.out.println("marks............");
        System.out.println("id     stud_id      subject       marks");

        HashSet<Marks> set = new HashSet<>(list);
        for (Marks mm : set) {
            System.out.println(mm.getId() + "        " + mm.getStud_id() + "         " + mm.getSubject() + "         " + mm.getMarks());
        }
    }

    public void printStudentDetails(List<StudentDetails> list) {
        System.out.println("studentdetails............");
        System.out.println("id  student_id  student_mobile");
        
        
        
        

        HashSet<StudentDetails> set = new HashSet<>(list);
        for (StudentDetails sdd : set) {
            System.out.println(sdd.getId() + "    " + sdd.getStud_id() + "    " + sdd.getMobile());
        }
    }

    public void printClassDetails(ArrayList<ClassDetails> list) {
        System.out.println("ClassDetails............");
        System.out.println("id         student_id");
        HashMap<Integer, ClassDetails> map = new HashMap<>();
        for (ClassDetails cdd : list) {
            if (!map.containsKey(cdd.getStud_id())) {
                map.put(cdd.getStud_id(), cdd);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            cd = new ClassDetails();
            cd = (ClassDetails) entry.getValue();
            System.out.println(cd.getId() + "       " + cd.getStud_id());
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
