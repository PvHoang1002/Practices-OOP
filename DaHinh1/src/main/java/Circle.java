public class Circle extends Shape {
    protected double radius;

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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
     * To String.
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color
                + ",filled=" + filled + "]";
    }
}
