
package Revision;

//year and month between two date

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class YearAndMonthBtDate {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        LocalDate userdate = LocalDate.of(2025, Month.MARCH, 20);
        Period diff = Period.between(today, userdate);
        System.out.println(" year diff is: "+diff.getYears()+"  month is: "+diff.getMonths());
        
        //get current time stamp
        
        Instant cts = Instant.now();
        System.out.println(" "+cts);
    }
}
