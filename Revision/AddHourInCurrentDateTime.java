package Revision;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class AddHourInCurrentDateTime {

    public static void main(String[] args) throws ParseException {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        LocalDateTime newtime = time.plusHours(4);
        System.out.println(newtime);

        System.out.println("");
        LocalDateTime mintime = time.plusMinutes(30);
        System.out.println("after 30 minute time will be: " + mintime);

        System.out.println("");
        LocalDateTime dattime = time.plusDays(30);
        System.out.println("After 30 day date will be: " + dattime);

        System.out.println("");
        LocalDateTime monthdate = time.plusMonths(2);
        System.out.println("after 2 month date will be " + monthdate);

        System.out.println("");
        LocalDateTime weektime = time.plusWeeks(2);
        System.out.println("After 2 week date will be: " + weektime);

        System.out.println("");
        LocalDateTime yeartime = time.plusYears(3);
        System.out.println("After 3 year of date will be: " + yeartime);

        System.out.println("after five second time will be: " + time.plusSeconds(5));
        System.out.println("date before five day: " + time.minusDays(5));
        System.out.println("time before five hour: " + time.minusHours(5));
        System.out.println("time before 35 minutes: " + time.minusMinutes(35));
        System.out.println("date before 10 month: " + time.minusMonths(10));
        System.out.println("date before 5 week: " + time.minusWeeks(5));
        System.out.println("date before 3 year: " + time.minusYears(3));

        System.out.println("");
        System.out.println("year: " + time.getYear());
        System.out.println("day of month: " + time.getDayOfMonth());
        System.out.println("day of week: " + time.getDayOfWeek());
        System.out.println("day of year: " + time.getDayOfYear());
        System.out.println("hour: " + time.getHour());
        System.out.println("month: " + time.getMonth());
        System.out.println("minute: " + time.getMinute());
        System.out.println("second: " + time.getSecond());
        System.out.println("monthvalue: " + time.getMonthValue());

        System.out.println("");
        System.out.println("withDayOfMonth(5): " + time.withDayOfMonth(5));
        System.out.println("withDayOfYear(2): " + time.withDayOfYear(2));
        System.out.println("withHour(5): " + time.withHour(5));
        System.out.println("withMonth(3): " + time.withMonth(3));
        System.out.println("withMinute(55): " + time.withMinute(55));
        System.out.println("withYear(5): " + time.withYear(5));
        System.out.println("withSecond(55): " + time.withSecond(55));

        System.out.println("");

        //get date before and after one year
        Calendar cl = Calendar.getInstance();
        Date cdate = cl.getTime();
        //get next Year

        System.out.println(" " + cl.getMinimalDaysInFirstWeek());
        System.out.println(" " + cl.getCalendarType());
        System.out.println(" " + cl.getWeeksInWeekYear());
        System.out.println(" " + cl.isLenient());
        System.out.println(" " + cl.isWeekDateSupported());
        System.out.println(" " + cl.getActualMaximum(1));
        System.out.println(" " + cl.getTimeZone());
        System.out.println("");

        cl.add(Calendar.YEAR, 1);
        Date nyear = cl.getTime();

        cl.add(Calendar.YEAR, -2);//after adding 1 it will be 22 and after sub -2 it will be 20
        Date pdate = cl.getTime();

        System.out.println("" + cdate + "   " + nyear + "   " + pdate);
        
        //check for leap year by date ready function
        LocalDate localdate = LocalDate.now();
        if(localdate.isLeapYear()){
            System.out.println(localdate+" is leap Year");
        }else{
            System.out.println(localdate+" is not a leap year");
        }
    }
}
