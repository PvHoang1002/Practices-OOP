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
        super(side, side);
    }

    /**
     * Constructor.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    /**
     * To String.
     */
    @Override
    public String toString() {
        return "Square[side=" + getSide() + ",color=" + color
                + ",filled=" + filled + "]";
    }
}
