public class Square extends Rectangle {

    /**
     * Constructor.
     */
    public Square() {

    }

    /**
     * Constructor.
     */
    public Square(double side) {
        this.length = side;
        this.width = side;
    }

    /**
     * Constructor.
     */
    public Square(double side, String color, boolean filled) {
        super();
        this.length = side;
        this.width = side;
    }

    /**
     * Constructor.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setLength(double side) {
        this.width = side;
        this.length = side;
    }

    /**
     * Compare.
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * To String.
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + getSide() + ",color=" + color
                + ",filled=" + filled + "]";
    }
}
