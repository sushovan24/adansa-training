package TwentyOneSep;

import java.text.SimpleDateFormat;
import java.sql.*;

public class SqlToUtilDate {

    public static void main(String[] args) {
        long millis = System.currentTimeMillis();

        java.sql.Date sqldate = new java.sql.Date(millis);

        java.util.Date utildate = new java.util.Date(sqldate.getTime());

        System.out.println(utildate);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("MMM/dd/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/dd/MMM");

        final String date = sdf.format(utildate);
        final String date1 = sdf1.format(utildate);
        final String date2 = sdf2.format(utildate);

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println("");
        System.out.println("date retrive from database");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adansasolution", "root", "");
            String sql = "select mydate from adansadate";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                java.sql.Date sqldate3 = rs.getDate("mydate");
                final String utildate3 = sdf.format(sqldate3);
                final String utildate4 = sdf1.format(sqldate3);

                System.out.println(utildate3);
                System.out.println(utildate4);
                System.out.println("");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
