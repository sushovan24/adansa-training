
package com.practice.mohsintraining.collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
public class StudentDemo {
  private int stu_id;
  private String stud_name;
  String mobile;
  String subject;
  int marks;
  StudentDetails sd=new StudentDetails();//object creation;
  Marks mark=new Marks();
  ClassDetails cd=new ClassDetails();
  Student s=new Student();
  
  // method for mixturelist
  public void mixtureList(){
        ArrayList<Mixture> list=new ArrayList<>();
        Mixture m1 = new Mixture();
        m1.setId(10);
        m1.setStud_id(100);
        m1.setStu_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("MTH");
        m1.setMarks(75);
        list.add(m1);
	m1 = new Mixture();
        m1.setStud_id(101);
        m1.setStud_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("PHY");
        m1.setMarks(70);
        list.add(m1);
	m1 = new Mixture();
        m1.setStud_id(102);
        m1.setStud_name("rajkumar rao");
        m1.setMobile("8298241737");
        m1.setSubject("MTH");
        m1.setMarks(78);
        list.add(m1);
	
	m1 = new Mixture();
        m1.setStud_id(102);
        m1.setStud_name("R rajkumar");
        m1.setMobile("8298241735");
        m1.setSubject("ENG");
        m1.setMarks(55);
        list.add(m1);
	m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar S");
        m1.setMobile("8298241732");
        m1.setSubject("MTH");
        m1.setMarks(50);
        list.add(m1);
	
	m1 = new Mixture();
        m1.setStud_id(102);
        m1.setStud_name("rajkumar Rao");
        m1.setMobile("8298246734");
        m1.setSubject("ENG");
        m1.setMarks(15);
        list.add(m1);
	
        m1 = new Mixture();
        m1.setStud_id(104);
        m1.setStud_name("T rajkumar");
        m1.setMobile("8278241734");
        m1.setSubject("CHEM");
        m1.setMarks(65);
	list.add(m1);
	m1 = new Mixture();
        m1.setStud_id(100);
        m1.setStud_name("rajkumar");
        m1.setMobile("8298241734");
        m1.setSubject("ENG");
        m1.setMarks(45);
        list.add(m1);
	
	m1 = new Mixture();
        m1.setStud_id(104);
        m1.setStud_name("T rajkumar");
        m1.setMobile("5298241734");
        m1.setSubject("MTH");
        m1.setMarks(75);
        list.add(m1);
	
	    m1 = new Mixture();
        m1.setStud_id(104");
        m1.setStud_name("T rajkumar");
        m1.setMobile("5298241734");
        m1.setSubject("ENG");
        m1.setMarks(25);
        list.add(m1);
       
    public static void main(String[] args) {
        
    
        ArrayList<Student> list1=new ArrayList<>();
        Student st=new Student();
        st.setId(10);
        st.setName("mohsin");
        list1.add(st);
  }
}
