package Final;

import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;

public class Movie {
    String title;
    GregorianCalendar releaseDate;
    List<String> actorList;
    String director;

    public Movie(String title, GregorianCalendar releaseDate, List<String> actorList, String director){
        this.title = title;
        this.releaseDate = releaseDate;
        this.actorList = actorList;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public GregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    public List<String> getActorList() {
        return actorList;
    }

    public String getDirector() {
        return director;
    }

    static class TitleComparator implements Comparator<Movie> {
        public int compare(Movie a, Movie b) {
            return a.getTitle().compareTo(b.getTitle());
        }
    }

}
