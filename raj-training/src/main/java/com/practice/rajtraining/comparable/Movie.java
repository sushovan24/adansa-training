package com.practice.rajtraining.comparable;

public class Movie implements Comparable<Movie> {

    private int id;
    private String name;
    private double ratting;

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

    public double getRatting() {
        return ratting;
    }

    public void setRatting(double ratting) {
        this.ratting = ratting;
    }

    @Override
    public int compareTo(Movie m) {

        return name.compareTo(m.name);
    }

}
