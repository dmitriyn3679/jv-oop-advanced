package core.basesyntax;

public abstract class Figure {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract String toString();
}
