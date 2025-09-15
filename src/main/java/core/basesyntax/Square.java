package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq. units, x: " + side + " units, "
                + "color: " + color;
    }
}
