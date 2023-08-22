package Homrework1;

/**
 * Пример решения задачи декларативным стилем
 * Вычисление суммы цифр числа. Напишите программу, которая вычисляет сумму всех цифр заданного числа,
 * используя математические операции и деление нацело.
 */
public class Task8 {
    public static void main(String[] args) {
        sumDigitsNumber(731);
    }

    /**
     * Нахождение суммы цифр числа
     * @param a число для поиска его суммы цифр
     */
    public  static void sumDigitsNumber(int a){
        int sum = 0;
        while (a != 0){
            sum += (a % 10);
            a /= 10;
        }
        System.out.println(sum);
    }
}
