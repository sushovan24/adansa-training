/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.mohsintraining.calander;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class CalenderStringToDate {
    public static void calender() throws ParseException//throws ParseException
    {
    SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
      String date="22-03-2016 8:36:10" ;
      System.out.println(sdf.parse(date));  
}
}