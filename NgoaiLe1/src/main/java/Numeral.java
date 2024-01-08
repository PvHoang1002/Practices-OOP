import java.text.DecimalFormat;

public class Numeral extends Expression {
    private double value;

    public Numeral(double value) {
        this.value = value;
    }

    public Numeral() {

    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0");
        return df.format(value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
