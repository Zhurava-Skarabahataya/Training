package epamOnline.chapter_2.oneDimensionalArrays;

// 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Z");
        int z = sc.nextInt();
        int switches = 0;
        int [] numbers = {2, -4, 1, 9, 10, 2345, 65};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > z){
                numbers[i] = z;
                switches++;
            }
        }
        System.out.println(switches);
    }
}
