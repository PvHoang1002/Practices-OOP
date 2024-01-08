import java.lang.Math;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    protected static final double PI = Math.PI;

    /**
     * Constructor.
     */
    public Circle() {
        this.color = "red";
    }

    /**
     * Constructor.
     */
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /**
     * Constructor.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Get area.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * To String.
     */
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
