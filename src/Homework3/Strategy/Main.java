package Homework3.Strategy;

public class Main {
    public static void main(String[] args) {
        SortStrategy selection = new SelectionSort();
        SortStrategy bubble = new BubbleSort();

        int[] arr = {4,1,4,7,2,123,-1231,2,-4,11,666};

        selection.sort(arr);
        bubble.sort(arr);


    }
}
