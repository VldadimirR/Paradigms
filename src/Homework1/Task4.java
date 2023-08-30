package Homework1;

import java.util.ArrayList;
import java.util.List;

/**
 * Пример решения задачи декларативным стилем
 * Поиск уникальных элементов в списке. Напишите программу, которая создает новый список, содержащий только уникальные элементы из исходного списка.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);

        System.out.println(uniqueElementsList(list));
    }

    /**
     * нахождение уникальных чисел
     * @param list - изначальный список чисел
     * @return - спсиок уникальных значений
     */
    public static List<Integer> uniqueElementsList(List<Integer> list){
         List<Integer> UniqueNumbers = list.stream().distinct().toList();
         return UniqueNumbers;

    }
}
