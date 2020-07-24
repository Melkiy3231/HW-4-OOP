package main.java.com.oop.shapes;

import main.java.com.oop.shapes.base.SpaceShape;
import main.java.com.oop.vertex.Vertex3D;

import java.util.Collections;

public class Sphere extends SpaceShape {
    private double radius;
    private Vertex3D center;

    public Sphere(Vertex3D center, double radius) {
        super(Collections.singletonList(center));
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Spheren " +
                " center=" + center +
                " radius=" + radius +
                " area=" + getArea() +
                " volume=" + getVolume();
    }
}
