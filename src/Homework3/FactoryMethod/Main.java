package Homework3.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createShape(ShapeType.SQUARE);

    }
}
