package Designpatterns.factory;

public class ShapeFactory {

    public Shape createShape(String shape) {
        if (shape == null) {
            return null;
        }

        switch (shape.toLowerCase()) {
            case "circle":
                return new Circle();

            case "rectangle":
                return new Rectangle();

            default:
                throw new IllegalArgumentException("No shape available.");
        }
    }
}
