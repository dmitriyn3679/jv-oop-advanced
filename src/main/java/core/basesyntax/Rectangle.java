package core.basesyntax;

public class Rectangle extends Figure {
    private final int x;
    private final int y;

    public Rectangle(int x, int y, Color color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return x * y;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea() + " sq. units, x: " + x + " units, " + "y: " + y + " units, color: " + color;
    }
}
