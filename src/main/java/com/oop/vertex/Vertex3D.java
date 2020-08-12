package main.java.com.oop.vertex;

public  class Vertex3D extends Vertex2D {

    private final double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "{x = " + super.getX() + ", y = " + super.getY() + ", z = " + z + "}";
    }

       private double getDistance() {
        return getDistance();
    }
}
