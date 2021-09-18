
package com.JavaDateAndTime;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class AddSomeHour {
    public static void main(String[] args) throws ParseException {
        LocalTime time=LocalTime.now();
        
        LocalTime newtime = time.plusHours(4);
        System.out.println(time);
        System.out.println(newtime);
        
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime newldt = ldt.plusHours(4);
        System.out.println(ldt);
        System.out.println(newldt);
        
        
    }
}
