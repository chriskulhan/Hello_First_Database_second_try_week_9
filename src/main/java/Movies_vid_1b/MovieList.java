package Movies_vid_1b;

public class MovieList {

    //make database path:
    //this ("jdbc:sqlite:movie_watchlist.sqlite") is a different file than the others you've been working with:
    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";

    //create another variable
    //this will be an object called Database with type database, and will be one of the objects
    //  found in here: Database.java
    private static Database database;

    //add the main method here:
    public static void main(String[] args) {
        //create a new database object:
        database = new Database(DB_PATH);

    }
}
