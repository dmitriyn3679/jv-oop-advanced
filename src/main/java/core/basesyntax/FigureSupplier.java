package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomNumber() {
        return random.nextInt(1, 20);
    }

    private Color getRandomColor() {
        return colorSupplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = new Random().nextInt(Figures.values().length);
        Color randomColor = getRandomColor();

        switch (randomFigureNumber) {
            case 0:
                int radius = getRandomNumber();
                return new Circle(radius, randomColor);

            case 1:
                int rectangleSideA = getRandomNumber();
                int rectangleSideB = getRandomNumber();
                return new Rectangle(rectangleSideA, rectangleSideB, randomColor);

            case 2:
                int side = getRandomNumber();
                return new Square(side, randomColor);

            case 3:
                int firstLeg = getRandomNumber();
                int secondLeg = getRandomNumber();
                return new RightTriangle(firstLeg, secondLeg, randomColor);

            case 4:
                double sideA = getRandomNumber();
                double sideB = getRandomNumber();
                double height = getRandomNumber();
                return new IsoscelesTrapezoid(sideA, sideB, height, randomColor);

            default:
                throw new IllegalStateException("Unexpected figure type: " + randomFigureNumber);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
