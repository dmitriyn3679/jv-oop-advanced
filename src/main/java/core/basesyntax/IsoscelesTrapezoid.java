package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double a;
    private final double b;
    private final double height;

    public IsoscelesTrapezoid(double a, double b, double height, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (a + b) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure isosceles trapezoid, area: " + getArea()
                + " sq. units, sideA: " + a + " units, sideB: " + b + " units, height: " + height
                + " units, color: " + color;
    }
}
