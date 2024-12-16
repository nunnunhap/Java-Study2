package geometry;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x >= 0)
            this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y>=0)
            this.y = y;
    }





}
