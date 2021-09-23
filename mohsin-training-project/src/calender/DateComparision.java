/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparision {

    public static void main(String[] args) throws ParseException {
        //String requredDate ="13/20/1980"; //cheaking purpose 
        String requredDate="13/20/1998";
        String startDate = "06/14/1990";
        String endDate = "12/30/2017";
        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
        Date sDate = sdf.parse(startDate);  //ParseDate(startDate);starting purpose 
        Date eDate = sdf.parse(endDate);  //ParseDate(endDate); ending purpose 
        Date date = sdf.parse(requredDate); //ParseDate(requiredDate); comparision purpose
        if (date.compareTo(sDate) >= 0 && date.compareTo(eDate) <= 0) 
        {
            System.out.println("Requred date with in the limit ");
        } 
        else {
            System.out.println("Date is out of range ");
        }
    }
}


    


