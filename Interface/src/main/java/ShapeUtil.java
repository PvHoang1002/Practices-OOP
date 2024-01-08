import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {
    /**
     * Print info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String list = "";
        List<Circle> circles = new ArrayList<Circle>();
        List<Triangle> triangles = new ArrayList<Triangle>();
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                circles.add((Circle) shape);
            } else if (shape instanceof Triangle) {
                triangles.add((Triangle) shape);
            }
        }
        if (circles.size() > 0) {
            list += "Circle:\n";
            for (Circle circle : circles) {
                list += circle.getInfo() + "\n";
            }
        }
        if (triangles.size() > 0) {
            list += "Triangle:\n";
            for (Triangle triangle : triangles) {
                list += triangle.getInfo() + "\n";
            }
        }
        return list;
    }
}
