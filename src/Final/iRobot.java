package Final;

public interface iRobot {
    boolean move();

    void turnLeft();

    void turnRight();

    void clean();

    enum Direction {UP, DOWN, LEFT, RIGHT}

}
