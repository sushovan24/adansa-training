
package com.practice.mohsintraining.collection;
public class Marks {
  private int id;
  private int stud_id;
  private String subject;
  private int marks;
  private String remarks;
    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Marks{" + "stud_id=" + stud_id + ", id=" + id + ", subject=" + subject + ", marks=" + marks + ", remarks=" + remarks + '}';
    }

    void getRemarks(int marks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}

// logic writing 
