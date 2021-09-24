package com.practice.rajtraining.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

    public void comparable() {
        ArrayList<Movie> list = new ArrayList<>();
        Movie m = new Movie();
        m.setId(1);
        m.setName("DDL");
        m.setRatting(7.8);
        list.add(m);

        m = new Movie();
        m.setId(2);
        m.setName("dhoom");
        m.setRatting(6.9);
        list.add(m);

        m = new Movie();
        m.setId(3);
        m.setName("dhoom 2");
        m.setRatting(7.5);
        list.add(m);

        m = new Movie();
        m.setId(4);
        m.setName("dhol");
        m.setRatting(8);
        list.add(m);

        Collections.sort(list);
        for (Movie movie : list) {
            System.out.println(movie.getId() + "  " + movie.getName() + " " + movie.getRatting());
        }
    }
}
