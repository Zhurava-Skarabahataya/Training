package epamOnline.chapter_2.sortings;

//5. Сортировка вставками. Дана последовательность чисел n aaa , ,, 21  .
// Требуется переставить числа в порядке возрастания.
// Делается это следующим образом.
// Пусть i aaa , ,, 21  - упорядоченная последовательность, т. е. na aa    21 .
// Берется следующее число 1 +ia и вставляется в последовательность так,
// чтобы новая последовательность была тоже возрастающей.
// Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
// Примечание. Место помещения очередного элемента в отсортированную часть
// производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class Task5InsertionSort {
    public static void main(String[] args) {
        int[] array = ArrayManager.getAnArrayOf(5);
        for (int i = 1; i < array.length; i++) {
            int index = binarySearchOfIndex(array[i], array, 0, i-1);
            int temp = array[index];
            array[index] = array[i];
            for (int j = index + 1; j <= i ; j++) {
                int anotherTemp = array[j];// temp = array[j-1];
                array[j] = temp;
                temp = anotherTemp;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    static int binarySearchOfIndex (int number, int[] array, int left, int right){
        if (number > array[right]){
            return right+1;
        }
        else if (number < array[left]){
            return 0;
        }
        while (right >= left){
            int mid = (right + left)/2;
            if (array[mid] <= number && array[mid+1] > number){
                return mid + 1;
            }
            else if (array[mid] < number){
                left = mid + 1;
                return binarySearchOfIndex(number, array, left, right);
            }
            else if (array[mid] > number){
                right = mid - 1;
                return binarySearchOfIndex(number, array, left, right);
            }
        }
        return -1;
    }
}
