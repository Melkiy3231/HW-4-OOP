package main.java.com.oop;
import main.java.com.oop.shapes.*;
import main.java.com.oop.shapes.base.Shape;
import main.java.com.oop.vertex.Vertex2D;
import main.java.com.oop.vertex.Vertex3D;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(new Vertex2D(1, 2), 4, radius));
        shapes.add(new Rectangle(new Vertex2D(2, 5), 2.4, 5.8));
        shapes.add(new Triangle(new Vertex2D(-2, 6), new Vertex2D(3, 5), new Vertex2D(4, 0)));
        shapes.add(new Sphere(new Vertex3D(2, 4, 6), 3));
        shapes.add(new SquarePyramid(new Vertex3D(22, 44, 33), 58, 23));
        shapes.add(new Cuboid(new Vertex3D(32, 45, 23), 34, 12, 19));
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
