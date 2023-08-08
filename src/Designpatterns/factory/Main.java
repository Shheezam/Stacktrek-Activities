package Designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("RECTANGLE");
        shape.draw();
    }
}
