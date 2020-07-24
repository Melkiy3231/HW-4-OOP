package main.java.com.oop.shapes.base;

import main.java.com.oop.vertex.Vertex;
import main.java.com.oop.interfaces.AreaMeasurable;
import main.java.com.oop.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Vertex> points) {
        super(points, name);
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
