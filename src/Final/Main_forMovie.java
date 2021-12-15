package Final;

import java.util.*;

public class Main_forMovie {

    public static void main(String[] args) {
        // *** Q1 *** //
        // initial setup
        Netflix netflix = new Netflix("Netflix");

        // generate genres
        Genre fiction = new Genre();
        Genre action = new Genre();

        // generate movies
        String a1 = "Emma";
        String a2 = "Tom";
        String a3 = "Jerry";
        String a4 = "Jack";
        Movie m1 = new Movie("Harry Potter", new GregorianCalendar(2008, Calendar.APRIL, 8),
                                Arrays.asList(a1, a2), "Yates");
        Movie m2 = new Movie("Winnie the Pooh", new GregorianCalendar(1996, Calendar.DECEMBER, 14),
                Arrays.asList(a3, a4), "Ben");
        Movie m3 = new Movie("Cinderella", new GregorianCalendar(2011, Calendar.MAY, 21),
                Arrays.asList(a1, a3), "Leslie");
        Movie m4 = new Movie("Spider Man", new GregorianCalendar(2021, Calendar.JULY, 6),
                Arrays.asList(a2, a4), "Holly");

        // add movies to genre
        fiction.getMovieList().add(m1);
        fiction.getMovieList().add(m2);
        action.getMovieList().add(m3);
        action.getMovieList().add(m4);

        // add genre to Netflix
        netflix.genreList.add(fiction);
        netflix.genreList.add(action);

        // *** Q2 *** //
        // or all movies released before 2000, add the string "(Classic)" to the title
        netflix.getGenreList().stream()
                .flatMap(movie -> movie.movieList.stream())
                .filter(date -> date.releaseDate.get(Calendar.YEAR) < 2000 )
                .forEach(title -> title.setTitle( "Classic " + title.getTitle()));

        // *** Q6 *** //
        // sort by title
        for (Genre g : netflix.getGenreList()){
            Collections.sort(g.getMovieList(), new Comparator<Movie>() {
                @Override
                public int compare(Movie m1, Movie m2) {
                    return m1.getTitle().compareTo(m2.getTitle());
                }
            });
        }


    }











}
