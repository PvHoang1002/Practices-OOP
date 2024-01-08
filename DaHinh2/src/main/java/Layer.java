import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public List<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(List<Shape> shapes) {
        this.shapes = shapes;
    }

    /**
     * Add shape.
     */
    public void addShape(Shape newShape) {
        shapes.add(newShape);
    }

    /**
     * Remove Circles.
     */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * Get info.
     */
    public String getInfo() {
        StringBuilder list = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            list.append(shape.toString()).append("\n");
        }
        return list.toString();
    }

    /**
     * Remove duplicates.
     */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
