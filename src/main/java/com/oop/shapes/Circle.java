package main.java.com.oop.shapes;
import main.java.com.oop.interfaces.AreaMeasurable;
import main.java.com.oop.interfaces.PerimeterMeasurable;
import main.java.com.oop.shapes.base.PlaneShape;
import main.java.com.oop.vertex.Vertex2D;
import java.util.ArrayList;
import java.util.Collections;

public class Circle extends PlaneShape  {
    private final double radius;

    public Circle(Vertex2D vertex, String name, double radius) {
        super(Arrays.asList(vertex), name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius;
    }
}