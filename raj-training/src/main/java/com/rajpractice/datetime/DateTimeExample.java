
package com.rajpractice.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTimeExample {
    
    public void chechDateValid(String givenDate) throws ParseException{
        String fromDate = "20/05/2012";
        String toDate = "20/09/2021";
        
        
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date tdate = sdf.parse(toDate);
        Date fdate = sdf.parse(fromDate);
        Date gdate = sdf.parse(givenDate);
        
        boolean bool1 = tdate.after(gdate);
        boolean bool2 = fdate.before(gdate);
        
        if(bool1==bool2){
            System.out.println("given date is true");
        }else{
            System.out.println("false");
        }
    }
}
