package calender;
//import java.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class CalenderStringToDate {

    public static void main(String[] args) throws ParseException
    {
    SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
      String date="22-03-2016 8:36:10" ;
      System.out.println(sdf.parse(date));
    
}
}
