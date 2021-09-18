
package com.JavaDateAndTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateComparison {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format=new SimpleDateFormat("dd/MMM/yyyy");
        Date d1=format.parse("15/Oct/1999");
        Date d2=format.parse("17/Sep/2021");
        
        if(d1.compareTo(d2)>0){
            System.out.println("date 1 occur after date 2");
        }else if(d1.compareTo(d2) < 0){
            System.out.println("dat1 1 occur befor date 2");
        }else if(d1.compareTo(d2)==0){
            System.out.println("date 1 and date 2 are equal");
        }
        
        
        boolean bool1 = d1.after(d2);
        boolean bool2 = d1.before(d2);
        boolean bool3 = d1.equals(d2);
        
        if(bool1){
            System.out.println(d1 +" is after "+d2);
        }else if(bool2){
            System.out.println(d1 +" is before "+d2);
        }else if(bool3){
            System.out.println(d1+" is equals "+d2);
        }
        
        
    }
}
