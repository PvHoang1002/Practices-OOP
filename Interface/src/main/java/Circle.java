import java.text.DecimalFormat;

public class Circle implements GeometricObject {
    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Constructor.
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get area.
     */
    @Override
    public double getArea() {
        return this.radius * this.radius * PI;
    }

    /**
     * Get perimeter.
     */
    @Override
    public double getPerimeter() {
        return this.radius * 2 * PI;
    }

    /**
     * Get info.
     */
    @Override
    public String getInfo() {
        return "Circle[(" + String.format("%.2f", this.center.getPointX()) + ","
                + String.format("%.2f", this.center.getPointY()) + "),r="
                + String.format("%.2f", this.radius) + "]";
    }
}
