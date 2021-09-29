
package com.practice.mohsintraining.collection;
public class Mixture {
   private int id;
   private String stud_id;
   private String mobile;
   private String subject;
   private int markks;

    public String getStud_id() {
        return stud_id;
    }

    public void setStud_id(String stud_id) {
        this.stud_id = stud_id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Mixture{" + "stu_id=" + stu_id + ", id=" + id + ", mobile=" + mobile + ", subject=" + subject + ", marks=" + marks + '}';
    }
   private int marks;
}

// display purpose 



