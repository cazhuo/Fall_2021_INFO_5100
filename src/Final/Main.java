package Final;

public class Main {
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static void main(String[] args) {
        int[][] room = {{0,1,-1}, {0,0,1}};
        Roomba roomba = new Roomba(room);
    }
}
