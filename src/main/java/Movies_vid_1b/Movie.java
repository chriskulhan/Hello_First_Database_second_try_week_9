
//will be used to create Movie objects
//movie has a name and stars and whether it's been watched or not

package Movies_vid_1b;

public class Movie {
    //16a. set the variables to private:
    private String name;
    private int stars;
    private boolean watched;

    //create a constructor:
    Movie (String name, int stars, boolean watched) {
        this.name = name;
        this.stars = stars;
        this.watched = watched;

    }
    //16b. generate some getters and setters for the private data:
    //right-click, Generate, 'getters and setters', select all the variables:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
