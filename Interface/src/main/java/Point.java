import java.lang.Math;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     */
    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return this.pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return this.pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Get distance.
     */
    public double distance(Point other) {
        double distanceSquare = (this.pointX - other.pointX) * (this.pointX - other.pointX)
                + (this.pointY - other.pointY) * (this.pointY - other.pointY);
        double distance = Math.sqrt(distanceSquare);
        return distance;
    }
}
