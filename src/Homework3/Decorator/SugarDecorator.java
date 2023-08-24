package Homework3.Decorator;
/**
 * Конкретный декоратор сахара
 */
public class SugarDecorator extends CoffeDeacorator{

    public SugarDecorator(iCoffeeDec coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    public double getCost() {
        return coffee.getCost() + 0.2;
    }
}
