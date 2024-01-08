import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Find distance.
     */
    public double distance(Point other) {
        double distanceSquare = Math.pow((this.pointX - other.pointX), 2)
                + Math.pow((this.pointY - other.pointY), 2);
        double distance = Math.sqrt(distanceSquare);
        return distance;
    }

    /**
     * Compare.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            if (Double.compare(other.getPointX(), this.getPointX()) == 0
                    && Double.compare(other.getPointY(), this.getPointY()) == 0) {
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
        return "(" + df.format(pointX) + "," + df.format(pointY) + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPointX(), getPointY());
    }
}
