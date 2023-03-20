package lesson1003;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
//    3. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.

    public static void main(String[] args) {
        List<String> ourList = List.of("hi", "Anna", "25", "monday", "2023");
        System.out.println(onlyStringElementsList(ourList));
    }

    private static List onlyStringElementsList(List<String> arrayList) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            try  {
                int temp = Integer.parseInt(arrayList.get(i));
            } catch (Exception e) {
                newList.add(arrayList.get(i));
            }
        }
        return newList;
    }
}
