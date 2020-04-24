package epamOnline.chapter_2.oneDimensionalArrays;

// Дана последовательность целых чисел n aaa ,,, 21  .
// Образовать новую последовательность, выбросив из исходной те члены, которые равны )
// ,,,min( 2 1 n aaa  .

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        double[] numbers = {2.0, 4, 9.6, 0, 0, 123,0, 0,11, 12, 4, 9, 4, 3};
        double min = numbers[0];
        int minCounter = 0;

        for (double number : numbers) {
            if (number < min){
                min = number;
                minCounter = 1;
            }
            else if (number == min){
                minCounter++;
            }
        }
        double [] newArray = new double[numbers.length - minCounter];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != min){
                newArray [index++] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
