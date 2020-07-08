package main.java.com.oop.shapes.base;

public class Shape {
    import java.util.List;

    public class Shape {
        private final List vertex;
        private final String name;

        public Shape(List vertex, String name) {
            this.vertex = vertex;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Shape{" +
                    "vertex=" + vertex +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
