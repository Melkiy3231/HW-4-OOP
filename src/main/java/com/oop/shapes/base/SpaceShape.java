package main.java.com.oop.shapes.base;
import com.costaroot.metrics.AreaMeasurable;
import com.costaroot.metrics.VolumeMeasurable;
import com.costaroot.vertex.Vertex3D;
import java.util.List;

public class SpaceShape {
    public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

        public SpaceShape(List vertex3D, String name) {
            super(vertex3D, name);
        }
    }
}
