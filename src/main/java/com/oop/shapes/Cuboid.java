package main.java.com.oop.shapes;

import main.java.com.oop.shapes.base.SpaceShape;

import main.java.com.oop.vertex.Vertex;
import main.java.com.oop.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cuboid extends SpaceShape {
    private Vertex3D vertex3D;
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D point3D, double width, double height, double depth) {
        super(new ArrayList<>(Collections.emptyList()));
        this.vertex3D = point3D;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Cuboid(List<Vertex> points) {
        super(points);
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + depth * width);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid " +
                " vertex3D=" + vertex3D +
                " width=" + width +
                " height=" + height +
                " depth=" + depth +
                " area=" + getArea() +
                " volume=" + getVolume();
    }
}
