package Final;


import java.util.ArrayList;

public class Netflix {
    ArrayList<Genre> genreList;
    String name;

    public Netflix(String name){
        this.genreList = new ArrayList<Genre>();
        this.name = name;
    }

    public ArrayList<Genre> getGenreList() {
        return genreList;
    }

}

