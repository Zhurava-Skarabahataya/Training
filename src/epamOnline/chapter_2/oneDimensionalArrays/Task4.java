package epamOnline.chapter_2.oneDimensionalArrays;

// Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double[] numbers = {2.0, 4, -8, 9.6, 0, 0, 123};
        double max = numbers[0];
        double min = numbers[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
                maxIndex = i;
            }
            else if (numbers[i] < min){
                min = numbers[i];
                minIndex = i;
            }
        }
        double temp = numbers[minIndex];
        numbers[minIndex] = numbers[maxIndex];
        numbers[maxIndex] = temp;
        System.out.println(Arrays.toString(numbers));
    }
}
