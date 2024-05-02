//the SQL code will go here:

package Movies_vid_1b;

import java.sql.*;

public class Database {
    //2. Make a field to store the database path:
    private String databasePath;

    //1. use a constructor:
    //will create a movie table
    //need to know where the movie table is stored
        //-pass that in the argument area () after Database vv:
    Database(String databasePath){
        //3. add try catch with resources:

        //9. (in vid_7_or_1b_notes:
        //this will save the databasePath:
        this.databasePath = databasePath;

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
        //15b. write the SQL here *before* the prepared statement:
        // like a template string:
        String insertSQL = "INSERT INTO movies VALUES (?,?,?)";

        //6. try connecting to the database: (this is a try with resources try/catch block)
        try (Connection connection = DriverManager.getConnection(databasePath);
//        15a. Remove this and replace it with SQL prepared statements
//        Statement statement = connection.createStatement() (this was from 5.)

//        15c.//write the prepared statement:
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

             //todo (mine) be sure to come back and finish this by adding movie:
             //insert into movies values('Up, 4, true);

             //in order to tell the program what the question mark stands for
             // (1, is the first parameter, with movie.name)

            //17. change movie.name to movie.getName()
             preparedStatement.setString(1, movie.getName());

             //18. add the last 2 variables in the question mark to fill in the database:
             preparedStatement.setInt(2, movie.getStars());
             preparedStatement.setBoolean(3, movie.isWatched());

             //19. add execute statement:
            preparedStatement.execute();

//            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding movie" + movie + " because " + e);
        }

    }
}
