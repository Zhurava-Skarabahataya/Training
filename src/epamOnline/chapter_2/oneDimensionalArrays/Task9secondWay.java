package epamOnline.chapter_2.oneDimensionalArrays;

import java.util.Arrays;

public class Task9secondWay {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 3, 5, 9, 12, 5, 5, 4, 4, 3, 3, 5,1, 1, 1, 1, 4, 3, 9};
        int [] freq = new int [array.length];
        int maxFreq = 0;
        int howManyMax = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < freq.length; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }
            freq[i] = count;
            if (count > maxFreq){
                maxFreq = count;
                howManyMax ++;
            }
            else if (count == maxFreq){
                howManyMax++;
            }
        }
        int[] maxNumbers = new int[howManyMax];
        int counter = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq){
                maxNumbers[counter++] = array[i];
            }
        }
        Arrays.sort(maxNumbers);
        System.out.println(maxNumbers[0]);



    }
}
