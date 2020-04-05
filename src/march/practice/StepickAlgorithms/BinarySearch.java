package march.practice.StepickAlgorithms;

import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new BinarySearch().run();
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");

    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arrayOfNums = new int[arrayLength];
        for (int i = 0; i < arrayOfNums.length; i++) {
            arrayOfNums[i] = sc.nextInt();
        }
        int countOperations = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countOperations; i++) {
            int number = sc.nextInt();
            int ind = binarySearch(arrayOfNums, number);
            sb.append(ind);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    static int binarySearch(int[] array, double value) {
        int left = 0;
        int right = array.length - 1;
        while (right >= left) {
            int med = (right + left) / 2;
            if (array[med] == value) {
                return med + 1;

            } else if (array[med] > value) {
                right = med - 1;
            } else if (array[med] < value) {
                left = med + 1;
            }
        }
        return -1;

    }

}

