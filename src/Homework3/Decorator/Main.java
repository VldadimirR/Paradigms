package Homework3.Decorator;

public class Main {
    public static void main(String[] args) {
        iCoffeeDec coffeeDec = new Coffee();
        coffeeDec = new MilkDecorator(coffeeDec);
        coffeeDec = new SugarDecorator(coffeeDec);
        System.out.println(coffeeDec.getDescription() + ": $" + coffeeDec.getCost());
    }
}
