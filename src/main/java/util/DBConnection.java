package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/codevault_db";
    private static final String USER = "root";
    private static final String PASSWORD = "mahi2134";

    public static Connection getConnection() {
    	try {
    	    Class.forName("com.mysql.cj.jdbc.Driver");
    	    Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
    	    System.out.println("Database Connected Successfully!");
    	    return conn;
    	} catch (Exception e) {
    	    e.printStackTrace();
    	    return null;
    	}
    }
}