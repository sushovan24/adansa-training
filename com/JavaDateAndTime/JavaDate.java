
package com.JavaDateAndTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDate {
    public static void main(String[] args) throws ParseException {
        
        String sdate1="15/10/1999";
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sdate1);
        System.out.println(sdate1 +"\t" +date);
        
        String sdate2 = "15-Oct-1999";
        Date date2 = new SimpleDateFormat("dd-MMM-yyyy").parse(sdate2);
        System.out.println(sdate2 +"\t"+ date2);
        
        String sdate3 = "Fri, Oct 15 1999";
        Date date3 = new SimpleDateFormat("E, MMM dd yyyy").parse(sdate3);
        System.out.println(date3);
        
        String sdate4 = "15 10, 1999";
        Date date4 = new SimpleDateFormat("dd MM, yyyy").parse(sdate4);
        System.out.println(date4);
        
        String sdate5 = "Fri, Oct 15 1999 13:15:00";
        Date date5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss").parse(sdate5);
        System.out.println(date5);
        
        String sdate6 = "15-Oct-1999 20:54:50";
        Date date6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss").parse(sdate6);
        System.out.println(date6);
        
        Date date7 = new Date();
        date7.before(date7);
        
        /* if (dt1.after(dt2)) {
        System.out.println(dt1.toString() + " is greater than " + dt2.toString());
      } else if (dt1.before(dt2)) {
        System.out.println(dt1.toString() + " is less than " + dt2.toString());
      } else {
        System.out.println(dt1.toString() + " is equal to " + dt2.toString());
      }
    } catch (Exception e) {
      System.out.println("Exception is: " + e.toString());
    }*/
    }
}
