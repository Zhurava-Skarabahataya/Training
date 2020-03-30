package march.practice.StepickAlgorithms;

import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new BinarySearch().run();
        long end = System.currentTimeMillis();
        System.out.println(end-start + " ms");

    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        //int arrayLength = 5;
        int [] arrayOfNums = new int[arrayLength];
       // int [] arrayOfNums = { 1, 5, 8, 12, 13};
        for (int i = 0; i < arrayOfNums.length; i++) {
            arrayOfNums[i] = sc.nextInt();
        }
        int countOperations = sc.nextInt();
        //int countOperations = 5;
        //int [] njndei = { 8, 1, 23, 1, 11};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOperations; i++) {
            int number = sc.nextInt();
            //int number = njndei[i];
            int ind = binarySearch(arrayOfNums, number);
           // System.out.println("ind " + ind);
            sb.append(ind); sb.append(" ");
        }
        System.out.println(sb);
    }

        static int binarySearch(int[] array, double value) {
        int left = 0;
        int right = array.length - 1;
        while (right >= left){
            int med = (right + left) / 2;
            if (array[med] == value) {
                return med +1 ;

            } else if (array[med] > value) {
                right = med - 1;
            } else if (array[med] < value) {
                left = med + 1;
            }
        }
        return -1;

    }

}

