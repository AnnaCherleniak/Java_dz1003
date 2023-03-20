package lesson1003;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;



public class Task01 {
    //    1. Пусть дан произвольный список целых чисел, удалить из него четные числа
//    (в языке уже есть что-то готовое для этого)
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println(fillRandomList(numbers, 20));

        System.out.printf("Список после удаления четных чисел: \n" + removeEvenElements(numbers));
    }

    private static List<Integer> removeEvenElements(List<Integer> arrayList) {
        arrayList.removeIf(i -> i % 2 == 0);
        return arrayList;
    }

    private static List<Integer> fillRandomList(List<Integer> arrayList, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {

            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }


}
