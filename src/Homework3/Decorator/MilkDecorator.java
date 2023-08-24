package Homework3.Decorator;

/**
 * Конкретный декоратор молока
 */
public class MilkDecorator extends CoffeDeacorator{

    public MilkDecorator(iCoffeeDec coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    public double getCost() {
        return coffee.getCost() + 0.5;
    }
}
