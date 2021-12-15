package Final;

public class Roomba implements iRobot{
    int[][] room;
    int row = room.length;
    int col = room[0].length;
    int[] currPosition;
    Main.Direction dir;

    public Roomba(int[][] room) {
        this.room = room;
        this.dir = Main.Direction.DOWN;
        this.currPosition = new int[] {0, 0};
    }

    @Override
    public boolean move() {
        /**
         * four different directions, all need to check for :
         *      if (x >= room.length || x < 0
         *          || y >= room[0].length || y < 0
         *          || grid[x][y] == -1) continue;
         */
        switch (dir) {
            case DOWN:
            {
                int nextX = currPosition[0], nextY = currPosition[1]-1;
                if (nextX >= row || nextX < 0 || nextY >= col || nextY < 0) return false;
                if (room[nextX][nextY] == -1) return false;
                currPosition[0] = nextX;
                currPosition[1] = nextY;
                return true;
            }
            case UP:
            {
                int nextX = currPosition[0], nextY = currPosition[1]+1;
                if (nextX >= row || nextX < 0 || nextY >= col || nextY < 0) return false;
                if (room[nextX][nextY] == -1) return false;
                currPosition[0] = nextX;
                currPosition[1] = nextY;
                return true;
            }
            case LEFT:
            {
                int nextX = currPosition[0]-1, nextY = currPosition[1];
                if (nextX >= row || nextX < 0 || nextY >= col || nextY < 0) return false;
                if (room[nextX][nextY] == -1) return false;
                currPosition[0] = nextX;
                currPosition[1] = nextY;
                return true;
            }
            case RIGHT:
            {
                int nextX = currPosition[0]+1, nextY = currPosition[1];
                if (nextX >= row || nextX < 0 || nextY >= col || nextY < 0) return false;
                if (room[nextX][nextY] == -1) return false;
                currPosition[0] = nextX;
                currPosition[1] = nextY;
                return true;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + dir);
        }
    }

    @Override
    public void turnLeft() {
        this.dir = dir.LEFT;
    }

    @Override
    public void turnRight() {
        this.dir = dir.RIGHT;
    }

    @Override
    public void clean() {
        if (currPosition[0] <= room.length && currPosition[1] <= room[0].length &&
                room[currPosition[0]][currPosition[1]] == 0) {
            room[currPosition[0]][currPosition[1]] = 1;
        }
    }
}