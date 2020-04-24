package epamOnline.chapter_2.oneDimensionalArrays;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, -8, 9, 0, 0, 123};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > i){
                System.out.println(numbers[i]);
            }
        }
    }
}
