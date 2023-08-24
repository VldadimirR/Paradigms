package Homework3.FactoryMethod;

/**
 * основной класс для орпределения типа
 */
public class ShapeFactory {

    public Shape createShape(ShapeType type){
        Shape shape = null;

        switch (type){
            case SQUARE -> shape = new Square();
            case RECTANGLE -> shape = new Rectangle();
            case TRIANGLE -> shape = new Triangle();
        }
        return shape;
    }
}
