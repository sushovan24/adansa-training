package com.practice.rajtraining.collection;

public class Marks {
    //Marks[id<int>,stud_id<int>, subject<String>, marks<int>, remarks<String>]

    private int id;
    private int stud_id;
    private String subject;
    private int marks;
    private String remarks;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
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
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        // type casting of the argument.
        Marks other = (Marks) obj;

        // comparing the state of argument with
        // the state of 'this' Object
        if (stud_id != other.stud_id) {
            return false;
        }
        if (subject == null) {
            if (other.subject != null) {
                return false;
            }
        } else if (!subject.equals(other.subject)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + stud_id;
        result = prime * result
                + ((subject == null) ? 0 : subject.hashCode());
        return result;
    }

}
