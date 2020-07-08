package main.java.com.oop.shapes.base;
import main.java.com.oop.vertex.Vertex;
import main.java.com.oop.interfaces.AreaMeasurable;
import main.java.com.oop.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Vertex2D> vertex2D, String name) {
        super(vertex2D, name);
    }

    @Override
    public String toString() {
        return "{" + " Figure Name: " + getName() + " Area= " + getArea() + " Perimeter = " +
                getPerimeter() + "}\n" + super.getVertices();
    }
}
