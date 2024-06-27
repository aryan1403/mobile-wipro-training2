package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class App 
{
    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean even(int a) {
        return (a % 2 == 0);
    }
    public static void main( String[] args ) throws Exception
    {
        // Create the connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

        // prepare a st
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("select * from test1;");

        while (rs.next()) {
            System.out.println(rs.getString("name") + ", " 
                + rs.getInt(2) + ", " + rs.getInt(3));
        }
    }
}
