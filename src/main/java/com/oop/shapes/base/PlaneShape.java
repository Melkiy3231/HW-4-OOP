package main.java.com.oop.shapes.base;
import main.java.com.oop.vertex.Vertex;
import main.java.com.oop.interfaces.AreaMeasurable;
import main.java.com.oop.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
    private List<Vertex> vertex2D;

    public PlaneShape(List<Vertex> vertex2D) {
        super(vertex2D);
        this.vertex2D = vertex2D;
    }
}
