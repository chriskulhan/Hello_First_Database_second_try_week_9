
//will be used to create Movie objects
//movie has a name and stars and weather it's been watched or not

package Movies_vid_1b;

public class Movie {
    String name;
    int stars;
    boolean watched;

    //create a constructor:
    Movie (String name, int stars, boolean watched) {
        this.name = name;
        this.stars = stars;
        this.watched = watched;

    }
}
