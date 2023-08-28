package Homework4;

import java.util.ArrayList;
import java.util.List;

/**
 *  Чистые функции и неизменяемость данных: Напишите функцию,которая принимает список чисел и возвращает новый список,
 *  в котором каждый элемент умножен на 2. Убедитесь, что вы используете только чистые функции и не изменяете исходный список.
 */
public class Task5 {
    public static void main(String[] args) {

    }

    public static List<Integer> doubleRedaction( List<Integer> list){
        List<Integer> result = new ArrayList<>();
        for (int i: list) {
            result.add(i * 2);
        }
        return  result;
    }
}
