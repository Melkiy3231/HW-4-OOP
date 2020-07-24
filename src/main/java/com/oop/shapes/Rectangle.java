package main.java.com.oop.shapes;

import main.java.com.oop.shapes.base.PlaneShape;
import main.java.com.oop.vertex.Vertex;
import main.java.com.oop.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle extends PlaneShape {
    private Vertex2D vertex2D;
    private double width;
    private double height;

    public Rectangle(Vertex2D vertex2D, double width, double height) {
        super(new ArrayList<>(Collections.singletonList(vertex2D)));
        this.vertex2D = vertex2D;
        this.width = width;
        this.height = height;
    }

    @Override
    public List<Vertex> getPoints() {
        return super.getPoints();
    }

    @Override
    public void setPoints(List<Vertex> points) {
        super.setPoints(points);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle" +
                " point2D=" + vertex2D +
                ", width=" + width +
                ", height=" + height +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
