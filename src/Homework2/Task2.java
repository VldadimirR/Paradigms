package Homework2;

import java.util.ArrayList;
import java.util.List;

/**
 * Процедурное программирование
 * Имеется массив чисел. Необходимо разбить его на подмассивы так,
 * чтобы сумма чисел в каждом подмассиве была меньше или равна заданному значению X.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,2,1,3,6,5,2,1,3,4};
        int x = 10;
        List<List<Integer>> result = createSubArray(arr, x);

        for (List<Integer> list: result) {
            System.out.println(list);
        }

    }

    /**
     * создание подмассивов
     * @param arr - изначальный массив
     * @param x - регулирующее число
     * @return - Список листов
     */
    public static List<List<Integer>> createSubArray(int[] arr, int x){
        List<List<Integer>> subArrays = new ArrayList<>();
        List<Integer> currentSubArray = new ArrayList<>();
        int sum = 0;

        for (int n: arr) {
            if (sum + n <= x){
                currentSubArray.add(n);
                sum += n;
            } else {
                subArrays.add(currentSubArray);
                currentSubArray = new ArrayList<>();
                currentSubArray.add(n);
                sum = n;
            }
        }

        subArrays.add(currentSubArray);

        return subArrays;
    }

}
