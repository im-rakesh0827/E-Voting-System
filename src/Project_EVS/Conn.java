package Project_EVS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    Conn(){
        final String DBURL = "jdbc:mysql://localhost:3306/userdb";
        final String USERNAME = "root";
        final String PASSWORD = "Apple@0827";
        final String driver = "com.mysql.cj.jdbc.Driver";


        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Conn();
    }
}