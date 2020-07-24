package main.java.com.oop.shapes.base;

import main.java.com.oop.interfaces.AreaMeasurable;
import main.java.com.oop.interfaces.VolumeMeasurable;
import main.java.com.oop.vertex.Vertex3D;
import java.util.List;

public abstract class SpaceShape {
    public SpaceShape(List<Vertex3D> asList, String name) {

    }
    public abstract double getArea();

    public abstract double getVolume();

    public abstract class spaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

        public spaceShape(List vertex3D, String name){

            super(vertex3D, name);
        }
    }
}
