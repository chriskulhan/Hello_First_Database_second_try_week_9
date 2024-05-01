//the SQL code will go here:

package Movies_vid_1b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    //2. Make a field to store the database path:
    private String databasePath;

    //1. use a constructor:
    //will create a movie table
    //need to know where the movie table is stored
        //-pass that in the argument area () after Database vv:
    Database(String databasePath){
        //create table, or make sure it is created:
        //connect and create a table:
        //connection is the connection to the database (on the computer or on the internet)
        Connection connection = DriverManager.getConnection(databasePath);

        //statement can execute SQL statements (execute, create table, etc.)
        Statement statement = connection.createStatement();
    }
}
