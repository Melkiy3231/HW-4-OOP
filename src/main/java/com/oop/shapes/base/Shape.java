
package main.java.com.oop.shapes.base;

import main.java.com.oop.vertex.Vertex;

import java.util.List;

public abstract class Shape {

    private List<Vertex> points;

    public Shape(List<Vertex> points, String name) {
        this.points = points;
    }

    public List<Vertex> getPoints() {
        return points;
    }

    public void setPoints(List<Vertex> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "points=" + points +
                '}';
    }
}
