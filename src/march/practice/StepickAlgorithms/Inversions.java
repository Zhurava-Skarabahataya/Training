package march.practice.StepickAlgorithms;

import java.util.Scanner;

public class Inversions {

    static long invers = 0;


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new Inversions().run();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        sort(array);

        System.out.println(invers);
    }

    private int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int n = array.length;
        int med = n / 2;
        int[] left = new int[med];
        int[] right = new int[n - med];
        System.arraycopy(array, 0, left, 0, med);
        System.arraycopy(array, med, right, 0, n - med);
        left = sort(left);
        right = sort(right);
        return merge(left, right);
    }


    private static int[] merge(int[] a, int[] b) {
        int[] resultArray = new int[a.length + b.length];
        int j = 0, i = 0;
        for (int k = 0; k < resultArray.length; k++) {
            if (j == b.length || i < a.length && a[i] <= b[j]) {
                resultArray[k] = a[i];
                i++;
            } else {
                invers += a.length - i;
                resultArray[k] = b[j];
                j++;
            }
        }
        return resultArray;
    }
}
