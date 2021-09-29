package com.practice.mohsintraining.collection;
public class Student {
    private int id ;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void randId(){
        int k=(int) ((int)999*Math.random());
        System.out.println(k);
    }
}
