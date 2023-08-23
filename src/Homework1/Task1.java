package Homrework1;

/**
 * Пример решения задачи императивным стилем
 * Подсчет суммы четных чисел от 1 до N. Напишите программу, используя цикл, которая находит сумму всех четных чисел в диапазоне от 1 до заданного числа N.
 */

public class Task1 {
    public static void main(String[] args) {
        sumsEvenNumbers(6);
    }

    /**
     * Подсчет суммы четных чисел от 1 до N
     * @param numbers - максимальный диапозон для подсчета
     */
    public static void sumsEvenNumbers(int numbers){
        int sum = 0;
        for (int i = 1; i < numbers; i++) {
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
