package week02.Aufgabe4;

public class Labyrinth {
    private final boolean[][] accessible = {
            {true, true, true, true, true, true, true, true},
            {false, false, true, true, false, false, true, true},
            {true, true, false, true, false, true, false, true},
            {true, true, true, true, false, true, true, false},
            {true, false, false, false, false, false, false, true},
            {true, false, true, true, true, false, true, true},
            {true, true, true, false, true, true, true, true},
            {true, false, false, true, true, false, false, true}
    };

    private final boolean[][] visited = new boolean[8][8];

    private final int targetX = 7;
    private final int targetY = 7;

    public boolean findPath(int x, int y, String path) {
        path += "-> [" + x + ", " + y + "] ";
        if (!isAccessible(x, y) || visited[x][y]) {
            return false;
        } else if (x == targetX && y == targetY) {
            System.out.println(path);
            return true;
        } else {
            visited[x][y] = true;
            boolean found = findPath(x - 1, y, path) ||
                    findPath(x + 1, y, path) ||
                    findPath(x, y - 1, path) ||
                    findPath(x, y + 1, path);
            visited[x][y] = false;
            return found;
        }
    }

    private boolean isAccessible(int x, int y) {
    	return x >= 0 && x < 8 && y >= 0 && y < 8 && accessible[x][y];
    }

    public static void main(String[] args) {
    	System.out.println(new Labyrinth().findPath(0, 0, "PATH: "));
    }
}
