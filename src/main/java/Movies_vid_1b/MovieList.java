//this is main
package Movies_vid_1b;

import static input.InputUtils.*;

public class MovieList {

    //make database path:
    //this ("jdbc:sqlite:movie_watchlist.sqlite") is a different file than the others you've been working with:
    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";

    //create another variable
    //this will be an object of type Database (as in Database.java) with name 'database', and
    //      will be one of the objects
    private static Database database;

    //add the main method here:
    public static void main(String[] args) {
        //create a new database object called "database"
        //then passing it to the constructor in Database.java using "new Database(DB_PATH)"
        //then Database.java will be able to use this to set up the database
        database = new Database(DB_PATH);
        //this will start asking users for information about their movies:
        addNewMovie();
    }
    //notes in: vid_7_or_1b_notes
    //10. add a method to add new movies:
    public static void addNewMovie() {
        //add a do/while loop that ends when the user stops saying yes to "Add a movie to the watchlist"
        do {
            String movieName = stringInput("Enter the movie name");
            boolean movieWatched = yesNoInput("Have you seen this movie yet?");

            int movieStars = 0;
            if(movieWatched) {
                movieStars = positiveIntInput("What is your rating, in stars out of 5?");
            //todo (clara) add validation to make sure the number is between 0-5

                //11. make a new movie object; (will be a movie object from class Movie.java
                Movie movie = new Movie(movieName, movieStars, movieWatched);

                //12. give this movie object to the database (field at the top of MovieList.java
                //this information to save by adding .addNewMovie to the database object (from the top of this file)
                //with movie object in the parentheses:
                // **This (movie) vv will be the argument to the addNewMovie method found in Database.java
                database.addNewMovie(movie);

            }
        } while (yesNoInput("Add a movie to the watchlist?"));

    }
}
