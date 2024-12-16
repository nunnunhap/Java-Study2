package geometry;

public class Geometry {

    private Point origin;

    public Geometry(Point origin) {
        this.origin = origin;
    }

    public void draw() {
        System.out.println("원점 : (" + origin.getX() + ", " + origin.getY() + ")");
    }

}
