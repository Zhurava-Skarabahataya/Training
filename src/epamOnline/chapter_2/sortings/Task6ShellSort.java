package epamOnline.chapter_2.sortings;

//6. Сортировка Шелла. Дан массив n действительных чисел.
// Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента 1 +ii aи a .
// Если 1 + ii a a , то продвигаются на один элемент вперед.
// Если 1 + ii a a , то производится перестановка и сдвигаются на один элемент назад.
// Составить алгоритм этой сортировки.

import java.util.Arrays;

public class Task6ShellSort {
    public static void main(String[] args) {
        int[] array = {4, 6, 1, 20, 12, 3};
        boolean switches = true;
        while (switches) {
            switches = false;
            for (int i = 0; i < array.length - 1; i++) {
                int a = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (a > array[j]) {
                        int temp = array[j];
                        array[j] = a;
                        array[i] = temp;
                        switches = true;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
