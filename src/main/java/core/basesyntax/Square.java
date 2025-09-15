package core.basesyntax;

public class Square extends Figure {
    private final int x;

    public Square(int x, Color color) {
        super(color);
        this.x = x;
    }

    @Override
    public double getArea() {
        return x * x;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq. units, x: " + x + " units, " + "color: " + color;
    }
}
