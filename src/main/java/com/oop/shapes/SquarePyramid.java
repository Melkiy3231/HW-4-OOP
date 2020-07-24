package main.java.com.oop.shapes;

import main.java.com.oop.shapes.base.SpaceShape;
import main.java.com.oop.vertex.Vertex3D;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(Vertex3D pointA, Vertex3D pointB, Vertex3D pointC, Vertex3D pointD, Vertex3D pointE, double baseWidth, double pyramidheight) {
        super(Arrays.asList(pointA, pointB, pointC, pointD, pointE));
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidheight;
    }

    @Override
    public double getArea() {
        return (4 * baseWidth) / 2 * ((baseWidth / (2 * Math.tan(Math.toRadians(45))))
                + Math.sqrt(Math.pow(pyramidHeight, 2) + (Math.pow(baseWidth / 2 * Math.tan(Math.toRadians(45)), 2))));
    }

    @Override
    public double getVolume() {
        return Math.pow(baseWidth, 2) * pyramidHeight / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid" +
                getPoints() +
                " baseWidth=" + baseWidth +
                " pyramidHeight=" + pyramidHeight;
    }
}
