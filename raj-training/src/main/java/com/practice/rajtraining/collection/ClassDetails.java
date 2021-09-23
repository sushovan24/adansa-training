
package com.practice.rajtraining.collection;

import java.util.Date;


public class ClassDetails {
    //ClassDetails[id<int>, className<String>, startTime<dateTime>, endTime<datetime>, stud_id<int>]
    
    private int id;
    private String className;
    Date startTime;
    Date endTime;
    private int stud_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getStud_id() {
        return stud_id;
    }

    public void setStud_id(int stud_id) {
        this.stud_id = stud_id;
    }
    
    
}
