import java.lang.Math;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Constructor.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return this.p1;
    }

    public Point getP2() {
        return this.p2;
    }

    public Point getP3() {
        return this.p3;
    }

    /**
     * Get area.
     */
    @Override
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
        + p2.getPointX() * (p3.getPointY() - p1.getPointY())
        + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2;
    }

    /**
     * Get perimeter.
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    /**
     * Get info.
     */
    @Override
    public String getInfo() {
        return "Triangle[("
                + String.format("%.2f", p1.getPointX()) + "," + String.format("%.2f", p1.getPointY()) + ")"
                + ",(" + String.format("%.2f", p2.getPointX()) + "," + String.format("%.2f", p2.getPointY()) + ")"
                + ",(" +  String.format("%.2f", p3.getPointX()) + "," + String.format("%.2f", p3.getPointY())
                + ")]";
    }
}
