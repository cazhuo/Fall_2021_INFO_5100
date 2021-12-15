package Final;

import java.util.*;
import java.util.GregorianCalendar;

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

    public void setTitle(String title) {
        this.title = title;
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

    public String addReleaseYearToTitle() {
        this.setTitle(getReleaseDate().get(Calendar.YEAR) + this.getTitle());
        return this.getTitle();
    }

}
