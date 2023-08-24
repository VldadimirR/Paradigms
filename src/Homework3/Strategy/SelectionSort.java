package Homework3.Strategy;
/**
 * класс с конкретными реализациями стартегий
 */
public class SelectionSort extends SortStrategy{

    public SelectionSort(){

        this.sortStrategy = new SelectionSortStrategy();
    }
}
