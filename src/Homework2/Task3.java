package Homework2;

/**
 * Процедурное программирование
 * Написать функцию, которая возвращает n-тое число Фибоначчи.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(getFibonacci(5));
    }

    /**
     * поиск n числа Фибоначчи
     * @param n - требуемое число
     * @return найденное число Фибоначчи
     */
    public static int getFibonacci(int n){
        if (n <= 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else  {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
