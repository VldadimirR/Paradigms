package Homework3.FactoryMethod;

/**
 * Основная фигура
 */
public class Shape {

    double width;

    double height;

    public Shape(){

    }

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double searchArea(){
       return width * height;
    }
}
