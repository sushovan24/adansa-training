/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.array;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PANDIT
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("------------------ test working --------");
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adansasolution", "root", "YES");
            System.out.println(con);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
            // return null adansa@1234;
        }
    }
}
