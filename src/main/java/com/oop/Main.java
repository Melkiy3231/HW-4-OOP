
package main.java.com.oop;

import main.java.com.oop.shapes.*;
import main.java.com.oop.vertex.Vertex2D;
import main.java.com.oop.vertex.Vertex3D;
import java.util.ArrayList;
import java.util.List;
public  class Main {
    public static void main(String[] args) {
        List<Sphere> shapes = new ArrayList<>();
        shapes.add(new Triangle(new Vertex2D(3, 1), new Vertex2D(50, 71), new Vertex2D(21, 7)));
        shapes.add(new Rectangle(new Vertex2D(15, 15), 15, 15));
        shapes.add(new Circle(new Vertex2D(10, 5), 10));
        shapes.add(new Cuboid(new Vertex3D(12, 32, 15), 51, 12, 41));
        shapes.add(new Sphere(new Vertex3D(10, 10, 10), 20));
        shapes.add(new SquarePyramid
                (new Vertex3D(10, 10, 10),
                        new Vertex3D(20, 20, 20),
                        new Vertex3D(30, 30, 30),
                        new Vertex3D(40, 40, 40),
                        new Vertex3D(50, 50, 50),
                        10, 20));
        shapes.forEach(shape -> System.out.println(shape.toString()));
    }
}
