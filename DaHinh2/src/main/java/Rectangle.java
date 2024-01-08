import java.text.DecimalFormat;
import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

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

    /**
     * Constructor.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
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

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Get area.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Get perimeter.
     */
    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    /**
     * Compare.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            if (Double.compare(other.getWidth(), this.getWidth()) == 0
                    && Double.compare(other.getLength(), this.getLength()) == 0
                    && this.getTopLeft().equals(other.getTopLeft())) {
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
        return "Rectangle[topLeft=" + topLeft + ",width="
                + df.format(width) + ",length=" + df.format(length)
                + ",color=" + color + ",filled=" + filled + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getLength(), getTopLeft());
    }
}
