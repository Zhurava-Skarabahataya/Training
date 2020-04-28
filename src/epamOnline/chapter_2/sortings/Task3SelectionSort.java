package epamOnline.chapter_2.sortings;

//Сортировка выбором. Дана последовательность чисел n aaa  2 1 .
// Требуется переставить элементы так, чтобы они были расположены по убыванию.
// Для этого в массиве, начиная с первого, выбирается наибольший элемент
// и ставится на первое место, а первый - на место наибольшего.
// Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;

public class Task3SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 11, 12, 13, 14};
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int maxIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > max){
                    max = array[j];
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = max;
            array[maxIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
