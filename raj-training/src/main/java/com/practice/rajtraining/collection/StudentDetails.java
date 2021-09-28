package com.practice.rajtraining.collection;

public class StudentDetails {

    //StudentDetails[id<int>, stud_id<int>, mobile<String>]
    private int id;
    private int stud_id;
    private String mobile;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
        StudentDetails other = (StudentDetails) obj;

        // comparing the state of argument with
        // the state of 'this' Object
        if (stud_id != other.stud_id) {
            return false;
        }
        if (mobile == null) {
            if (other.mobile != null) {
                return false;
            }
        } else if (!mobile.equals(other.mobile)) {
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
                + ((mobile == null) ? 0 : mobile.hashCode());
        return result;

    }

}
