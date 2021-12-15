package Final;

import java.util.ArrayList;

public class Genre {
    ArrayList<Movie> movieList;

    public Genre(){
        this.movieList = new ArrayList<Movie>();
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }
}
