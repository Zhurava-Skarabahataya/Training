package epamOnline.chapter_2.sortings;

//Сортировка обменами. Дана последовательность чисел n aaa  2 1 .
// Требуется переставить числа в порядке возрастания.
// Для этого сравниваются два соседних числа 1 +ii aиa .
// Если 1 + ii a a , то делается перестановка.
// Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;

public class Task4BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 7, 11, 23, 9, 0, -5, 24};
        boolean ifSwitch = true;
        int switches = 0;
        while (ifSwitch){
            ifSwitch = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                     int temp = array[i];
                     array[i] = array[i+1];
                     array[i+1] = temp;
                     switches++;
                     ifSwitch = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Switches: " + switches);
    }
}
