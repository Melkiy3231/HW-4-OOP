package main.java.com.oop.vertex;

public abstract class Vertex {
    private double x;
    private double y;


    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculateDistance(Vertex point) {
        return Math.sqrt(
                Math.pow(this.x - point.getX(), 2)
                        + Math.pow(this.y - point.getY(), 2));

    }
}
