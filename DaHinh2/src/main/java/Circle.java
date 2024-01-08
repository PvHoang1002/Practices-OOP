import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    /**
     * Constructor.
     */
    public Circle() {

    }

    /**
     * Constructor.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Constructor.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Get area.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Get perimeter.
     */
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * Compare.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            if (Double.compare(other.getRadius(), this.getRadius()) == 0
                    && this.getCenter().equals(other.getCenter())) {
                return true;
            }
        }
        return false;
    }

    /**
     * To String.
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.0");
        return "Circle[center=" + center + ",radius=" + df.format(radius) + ",color=" + color
                + ",filled=" + filled + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius(), getCenter());
    }
}
