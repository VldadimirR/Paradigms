package Homework1;

import java.util.stream.IntStream;

/**
 *  Пример решения задачи декларативным стилем
 *  Вычисление факториала числа. Напишите программу, которая находит факториал заданного числа N с использованием рекурсии или встроенных функций.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
    }

    /**
     * Нахождение факториала числа с использованием IntStream
     * @param f - число у которого вычисляется факториал
     * @return результат нахождения факториала
     */
    public static int factorialNumber(int f){
        if (f <= 1) {
            return 1;
        }
        else {
            return IntStream.rangeClosed(2, f).reduce((x, y) -> x * y).getAsInt();
        }
    }
}
