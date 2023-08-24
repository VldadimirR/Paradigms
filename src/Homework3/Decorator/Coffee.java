package Homework3.Decorator;

/**
 * Конкретный экзкмпляр кофе
 */
public class Coffee implements iCoffeeDec {

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 2.5;
    }
}
