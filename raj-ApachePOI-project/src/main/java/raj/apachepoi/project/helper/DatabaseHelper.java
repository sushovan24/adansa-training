package raj.apachepoi.project.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:12753/training", "training", "training@123");
            }
        } catch (ClassNotFoundException | SQLException e) {

        }

        return con;
    }
}
