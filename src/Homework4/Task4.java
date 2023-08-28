package Homework4;

/**
 * Функции-редуцеры для списков: Напишите функцию-редуктор, которая принимает список строк и возвращает строку, состоящую из объединенных элементов списка через запятую.
 * Например, для списка ["apple", "banana", "cherry"] результат должен быть "apple, banana, cherry".
 */
public class Task4 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry"};
        System.out.println(stringConcant(arr));
    }

    public static StringBuilder stringConcant(String[] arr){
        StringBuilder sb = new StringBuilder();
        for (String s:arr) {
            sb.append(s).append(", ");
        }
        return sb;
    }
}
