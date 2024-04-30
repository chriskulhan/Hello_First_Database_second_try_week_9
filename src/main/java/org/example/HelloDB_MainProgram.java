package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloDB_MainProgram {
    //added "throws SQLException" just below. This will need to be a try/catch block in the future.
    public static void main(String[] args) throws SQLException {
    //this string will tell java where the database is:
        String url = "jdbc:sqlite:hello.sqlite";
        //to connect the database:
        Connection connection = DriverManager.getConnection(url);

        //vid_4_make_a_Statement:
        //this is what will run our database queries and ask our database to do things:
        Statement statement = connection.createStatement();

        //set up database with name "cats"  columns with column name "name" and type "TEXT"

        //I added "if not exists" because I like that better from previous database class:
//        String createTableSQl = "CREATE TABLE if not exists cats (name TEXT, age INTEGER)";
//        //to send it to the database to create the table:
//        statement.executeUpdate(createTableSQl);

        //insert statement to add data:
//        String insertDataSQl = "INSERT INTO cats VALUES ('Bingo', 14)";
//
//        //ask the 'statement' object from above to execute the above code:
//        statement.execute(insertDataSQl); //run this.

        //add more data:
        String insertDataSQL = "INSERT INTO cats VALUES ('bozo', 9)";
        statement.execute(insertDataSQL);
        //run this and now there are 2 cat added in: hello.sqlite->main->tables->cats

        //write a SELECT statement to get info from the database:
        String getAllDataSQL = "SELECT * FROM cats";

        //write a statement to execute SQL: and also send data back in a result set:
        ResultSet allCats = statement.executeQuery(getAllDataSQL);

        }
    }