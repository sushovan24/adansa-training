package com.practice.rajtraining.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeExample {

    public void chechDateValid(String givenDate) throws ParseException {

        String fromDate = "20/05/2012";
        String toDate = "20/09/2021";

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tdate = sdf.parse(toDate);
        Date fdate = sdf.parse(fromDate);
        Date gdate = sdf.parse(givenDate);

        boolean bool1 = fdate.before(gdate);
        boolean bool2 = tdate.after(gdate);

        System.out.println("fdate.before(gdate): "+bool1);
        System.out.println("tdate.after(gdate): "+bool2);
        if (bool1 == bool2) {
            System.out.println("given date is true");
        } else {
            System.out.println("false");
        }
    }
}
