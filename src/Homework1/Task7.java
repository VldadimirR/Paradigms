package Homework1;

/**
 * Пример решения задачи декларативным стилем
 * Поиск подстроки. Напишите программу, которая находит все вхождения заданной подстроки в строке с
 * использованием встроенных функций.
 */
public class Task7 {
    public static void main(String[] args) {
        String str = "Lalalvdlafgdfla";
        findSubstrings(str,"la");
    }

    /**
     * поиск количества вхождений подстроки
     * @param str строка
     * @param subStr подстрока
     */
    public static void findSubstrings(String str,String subStr){
        int index = str.indexOf(subStr);
        while (index >=0){
            System.out.println(index);
            index = str.indexOf(subStr, index + 1);
        }
    }
}
