package epamOnline.chapter_2.decomposition;

//8. Задан массив D. Определить следующие суммы:
// D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
// расположенных элементов массива с номерами от k до m.

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = ArrayManager.getAnArrayOf(10);
        System.out.println(Arrays.toString(array));
        int k = 3 - 1;
        int sum = 0;
        for (int i = 0; i < 3; i++, k++) {
            sum += array[k];
        }
        System.out.println(sum);
    }
}
