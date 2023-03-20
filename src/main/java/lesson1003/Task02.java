package lesson1003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Task02 {
//    2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
    public static void main(String[] args) {
        List<Integer> numbers = List.of(11, 25, 15, 85, 22, 9, 101, -15, 44, 0, 3);
        System.out.println("Минимальное значение списка: " + Collections.min(numbers));
        System.out.println("Максимальное значение списка: " + Collections.max(numbers));
        System.out.println("Среднее арифметическое значение списка: " + averageElementsList(numbers));

    }

    private static Integer averageElementsList(List<Integer> arrayList) {

        int sumElements = 0;
        for (int element: arrayList) {
            sumElements += element;
        }
        return sumElements/ arrayList.size();
    }


}
