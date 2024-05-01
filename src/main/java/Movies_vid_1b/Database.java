//the SQL code will go here:

package Movies_vid_1b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    //2. Make a field to store the database path:
    private String databasePath;

    //1. use a constructor:
    //will create a movie table
    //need to know where the movie table is stored
        //-pass that in the argument area () after Database vv:
    Database(String databasePath){
        //3. add try catch with resources:

        //create table, or make sure it is created:
        //connect and create a table:
        //connection is the connection to the database (on the computer or on the internet)
       try ( Connection connection = DriverManager.getConnection(databasePath);

        //statement can execute SQL statements (execute, create table, etc.)
        Statement statement = connection.createStatement()) {

           //4. ask the statement to do our SQL for us:
           statement.executeUpdate("CREATE TABLE IF NOT EXISTS " +
                   "movies(name text, stars integer, watch boolean)");


       } catch (SQLException e) {
           System.out.println("Error creating movie DB table because " + e);
       }
    }
    //5. write a method: void, called addNewMovie with Movie objects that will store data
    //and move them around (Movie movie)
    public void addNewMovie(Movie movie) {
        //6. try connecting to the database:
        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {
            //todo (mine) be sure to come back and finish this by adding movie:
//            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding movie" + movie + " because " + e);
        }

    }
}
