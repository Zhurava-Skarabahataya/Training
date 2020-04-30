package epamOnline.chapter_2.decomposition;

//5. Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива,
// но больше всех других элементов).

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = ArrayManager.getAnArrayOf(5);
        int max = array[0];
        int subMax = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                subMax = max;
                max = value;
            } else if (value < max && value > subMax) {
                subMax = value;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(subMax);
    }
}
