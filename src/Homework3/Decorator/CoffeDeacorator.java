package Homework3.Decorator;

/**
 * Основной декоратор
 */
public abstract class CoffeDeacorator implements iCoffeeDec {
    protected iCoffeeDec coffee;

    public CoffeDeacorator(iCoffeeDec coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
