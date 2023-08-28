package Homework4;

/**
 * Напишите рекурсивную функцию для вычисления факториала числа n.
 * Факториал числа n обозначается как n! и равен произведению всех положительных целых чисел от 1 до n.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);

    }
}
