package march.practice.chapter_1.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class FrequencyOfOccurence {
    static int[] array = {4, 5, 2, 6, 6, 6, 7,7 };


    public static void main(String[] args) {
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i : array) {
            if (mapa.containsKey(i)){
                int count = mapa.get(i);
                count++;
                mapa.put(i, count);
            }
            else {
                mapa.put(i, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entries = mapa.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        mapa.entrySet().stream().forEach(System.out::println);
        System.out.println();

        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println();
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);

    }

}
