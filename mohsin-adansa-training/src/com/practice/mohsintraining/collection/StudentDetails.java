package com.practice.mohsintraining.collection;

public class StudentDetails {

    private int id;
    private  int stud_id;
    private String mobile;

    /*
    
    
    Task[23-09-2021] pkg: collection
Create Class: Student[id<int>, Name<String>] ignore if already exists
	StudentDetails[id<int>, stud_id<int>, mobile<String>]
	Marks[id<int>,stud_id<int>, subject<String>, marks<int>, remarks<String>]
	ClassDetails[id<int>, className<String>, startTime<dateTime>, endTime<datetime>, stud_id<int>]
 ** <> this braces not include in your code for filed declaration.
Class Mixture[stud_id<int>, stud_name<String>, mobile<String>, subject<String>, marks<int>]
Ctreate a ArrayList<Mixture> with random respective value,
stud_id =1, stud_name="A", mobile="90876543", subject="PHY", marks=37 => all values should be duplicate.
add 10 records in ArrayList<Mixture>.
Then divide the value in respective classes.

    
    
    
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStu_id() {
        return stud_id;
    }

    public void setStud_id(int stu_id) {
        this.stud_id = stud_id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

// logic writing 
