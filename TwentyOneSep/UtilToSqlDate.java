
package TwentyOneSep;
import java.util.Date;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UtilToSqlDate {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        Date utildate = new Date();
        System.out.println(utildate);
        System.out.println("Enter date");
        String sdate = sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(sdate);
        
        java.sql.Date sqldate1 = new java.sql.Date(date.getTime());
        
        java.sql.Date sqldate = new java.sql.Date(utildate.getTime());
        System.out.println(sqldate);
        
        boolean f=false;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adansasolution","root","");
            String sql = "insert into adansadate(mydate) values(?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDate(1, sqldate1);
            int i=ps.executeUpdate();
            
            if(i==1){
                f=true;
            }
            
            if(f){
                System.out.println("data save suceesfully");
            }else{
                System.out.println("somthing wrong");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
}
