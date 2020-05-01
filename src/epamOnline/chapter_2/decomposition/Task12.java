package epamOnline.chapter_2.decomposition;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
// элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int k = 22;
        int n = 1000;
        int [] array = getArrayOfNumbers ( k, n);
        System.out.println(Arrays.toString(array));
    }

    private static int[] getArrayOfNumbers(int k, int n) {
        int [] array = new int [getHowManyNumbers(k , n) ];
        fillArrayWithNumbers(array, k, n);
        return array;
    }

    private static void fillArrayWithNumbers (int[] array, int k, int n){
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            if (getSumOfDigits(i) == k){
                array[counter++] = i;
            }
        }
    }

    private static int getHowManyNumbers (int k, int n){
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            if (getSumOfDigits(i) == k){
                counter++;
            }
        }
        return counter;
    }

    private static int getSumOfDigits (int a){
        int sum = 0;
        while (a !=0){
            sum += a%10;
            a /= 10;
        }
        return sum;
    }
}
