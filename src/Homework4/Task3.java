package Homework4;

/**
 * Фибоначчи через рекурсию: Напишите рекурсивную функцию для вычисления числа Фибоначчи с индексом n.
 * Напоминаю, что последовательность Фибоначчи определяется как: F(0) = 0, F(1) = 1 и F(n) = F(n-1) + F(n-2) для n > 1.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(findFib(5));
    }

    public static int findFib(int n){
        if (n == 1 || n == 2){
            return 1;
        } else {
            return findFib(n -1) + findFib(n - 2);
        }

    }
}
