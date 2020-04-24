package epamOnline.chapter_2.oneDimensionalArrays;

// Дан целочисленный массив с количеством элементов п.
// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
// Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 3, 5, 9, 12, 5, 5, 4, 4, 3, 3, 5,1, 1, 1, 1, 4, 3, 9};
        for (int i = 1; i < array.length; i +=2) {
            array[i] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
