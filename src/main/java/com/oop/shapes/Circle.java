package main.java.com.oop.shapes;

import main.java.com.oop.shapes.base.PlaneShape;
import main.java.com.oop.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.Collections;

public class Circle extends PlaneShape {
    private Vertex2D center;
    private double radius;

    public Circle(Vertex2D center, double radius) {
        super(new ArrayList<>(Collections.singletonList(center)));
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle " +
                " point2D=" + center +
                " radius=" + radius +
                " perimeter=" + getPerimeter() +
                " area=" + getArea();
    }
}
