package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloDB_MainProgram {
    //added "throws SQLException" just below. This will need to be a try/catch block in the future.
    public static void main(String[] args) throws SQLException {
    //this string will tell java where the database is:
        String url = "jdbc:sqlite:hello.sqlite";
        //to connect the database:
        Connection connection = DriverManager.getConnection(url);



        }
    }