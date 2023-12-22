package EX2;

public class Point {

    private int x, y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

