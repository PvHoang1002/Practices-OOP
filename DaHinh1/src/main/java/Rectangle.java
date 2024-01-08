public class Rectangle extends Shape {
    protected double width;
    protected double length;

    /**
     * Constructor.
     */
    public Rectangle() {

    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Get area.
     */
    @Override
    public double getArea() {
        return width * this.length;
    }

    /**
     * Get perimeter.
     */
    @Override
    public double getPerimeter() {
        return (width + this.length) * 2;
    }

    /**
     * To String.
     */
    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + "]";
    }
}
