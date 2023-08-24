package Homework3.Strategy;

/**
 * класс с конкретными реализациями стартегий
 */
public class BubbleSort extends SortStrategy{

    public BubbleSort(){
        this.sortStrategy = new BubbleSortStrategy();
    }
}
