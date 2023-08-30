package Homework1;

/**
 *  Пример решения задачи императивным  стилем
 *  Поиск наименьшего числа в списке. Напишите программу, которая находит наименьшее число в заданном списке с помощью цикла.
 */

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {5,2,1,0,34,111,-15};
        smallestNumberList(arr);
    }

    /**
     * Метод поиска наменьшего числа в списке
     * @param arr - список чисел
     */
    public static void smallestNumberList(int[] arr){
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
