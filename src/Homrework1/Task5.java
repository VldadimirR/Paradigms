package Homrework1;

/**
 *  Пример решения задачи императивным стилем
 *  Поиск простых чисел. Напишите программу, которая находит все простые числа в заданном диапазоне от 1 до N.
 */
public class Task5 {
    public static void main(String[] args) {
        findPrimeNumbers(1000);
    }

    /**
     * Нахождение простых чисел
     * @param n - диапозон нахождения простых чисел
     */
    public static void findPrimeNumbers(int n){
        int i, b;
        boolean flag;

        for (i = 1; i <= n; i++) {

            if (i == 1 || i == 0)
                continue;
            flag = true;

            for (b = 2; b <= i / 2; ++b) {
                if (i % b == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag)
                System.out.print(i + " ");
        }
    }
}
