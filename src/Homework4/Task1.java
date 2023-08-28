package Homework4;

/**
 * Рекурсивная сумма: Напишите рекурсивную функцию, которая вычисляет сумму всех чисел от 1 до n.
 * Например, для n = 5 результат должен быть 1 + 2 + 3 + 4 + 5 = 15.
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(recursiveSum(5));
    }

    public static int recursiveSum(int n){
        if (n == 1){
            return 1;
        }
        return n + recursiveSum(n - 1);
    }
}
