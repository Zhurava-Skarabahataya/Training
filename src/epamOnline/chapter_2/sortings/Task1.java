package epamOnline.chapter_2.sortings;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив,
// включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив.

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] firstArray = ArrayManager.getAnArrayOf(5);
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = ArrayManager.getAnArrayOf(4);
        System.out.println(Arrays.toString(secondArray));
        int k = 2;
        int[] result = new int[secondArray.length + firstArray.length];
        for (int i = 0; i < result.length; i++) {
            if (i <= k) {
                result[i] = firstArray[i];
            } else {
                for (int value : secondArray) {
                    result[i++] = value;
                }
                for (int j = k + 1; j < firstArray.length; j++) {
                    result[i++] = firstArray[j];
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
