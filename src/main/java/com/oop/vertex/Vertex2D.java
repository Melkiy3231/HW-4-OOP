package main.java.com.oop.vertex;

public  class Vertex2D extends Vertex  {
    private final double x;
    private final double y;


    public Vertex2D(double x, double y) {
        super(x, y);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;

    }

    public double getY() {
        return y;

    }

    @Override
    public String toString() {
        return "{x = " + x + ", y = " + y + "}";

    }

    public double getDistance(Vertex2D a, Vertex2D b) {
        return 0;
    }
}
