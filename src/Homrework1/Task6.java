package Homrework1;

import java.util.Arrays;

/**
 * Пример решения задачи императивным стилем
 * Упорядочивание списка. Напишите программу, которая сортирует список чисел в порядке возрастания с
 * использованием пузырьковой сортировки или другого метода сортировки.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 0, 7, 9, 8};
        System.out.println(Arrays.toString(sortBubble(arr)));
    }

    /**
     * Пузырьковая сортировка
     * @param arr - изначальный массив
     * @return - отсортированный массив
     */
    public static int[] sortBubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
