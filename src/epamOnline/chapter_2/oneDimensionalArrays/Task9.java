package epamOnline.chapter_2.oneDimensionalArrays;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.

import java.util.*;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 3, 5, 9, 12, 5, 5, 4, 4, 3, 3, 5,1, 1, 1, 1, 4, 3, 9};
        Arrays.sort(array);
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i : array) {
            if (mapa.containsKey(i)) {
                int val = mapa.get(i) + 1;
                mapa.put(i, val);
            } else {
                mapa.put(i, 1);
            }
        }
        int maximum = mapa.values().stream().max(Comparator.naturalOrder()).get();
        List<Integer> listOfMaxs;
        listOfMaxs = mapa.entrySet().stream().filter(e -> e.getValue() == maximum)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        Collections.sort(listOfMaxs);
        System.out.println(listOfMaxs.get(0));

    }
}
