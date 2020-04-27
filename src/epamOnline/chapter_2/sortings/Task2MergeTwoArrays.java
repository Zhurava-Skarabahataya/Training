package epamOnline.chapter_2.sortings;

//2. Даны две последовательности m n b bb иaaa       2 121
//. Образовать из них новую последовательность чисел так,
// чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Task2MergeTwoArrays {
    public static void main(String[] args) {
        int [] firstArray = {1, 3, 5, 6, 7};
        int [] secondArray = {2, 4, 6, 8, 10};
        int [] result = new int[firstArray.length + secondArray.length];
        int firstArrIndex = 0;
        int secondArrIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (firstArrIndex >= firstArray.length && secondArrIndex < secondArray.length){
                result[i] = secondArray[secondArrIndex++];
                continue;
            }
            if (secondArrIndex >= secondArray.length && firstArrIndex < firstArray.length){
                result[i] = firstArray[firstArrIndex++];
                continue;
            }
            if (firstArray[firstArrIndex] <= secondArray[secondArrIndex]){
                result[i] = firstArray[firstArrIndex++];
            }
            else {
                result[i] = secondArray[secondArrIndex++];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
