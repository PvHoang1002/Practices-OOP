public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * Constructor.
     */
    public Cylinder() {
        this.height = 1.0;
    }

    /**
     * Constructor.
     */
    public Cylinder(double radius) {
        super(radius);
        this.color = "red";
        this.height = 1.0;
    }

    /**
     * Constructor.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.color = "red";
        this.height = height;
    }

    /**
     * Constructor.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Get volume.
     */
    public double getVolume() {
        double area = super.getArea();
        return area * height;
    }

    /**
     * Get area.
     */
    @Override
    public double getArea() {
        return super.getArea() * 2;
    }

    /**
     * To string.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }
}
