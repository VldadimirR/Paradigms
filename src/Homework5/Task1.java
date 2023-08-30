package Homework5;

/**
 * Напишите программу, которая находит все простые числа в заданном диапазоне.
 */
public class Task1 {
    public static void main(String[] args) {
        findPrimeNumbers(500,600);
    }

    public static void findPrimeNumbers(int start, int end) {
        int i, b;
        boolean flag;

        for (i = start; i <= end; i++) {

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
