package epamOnline.chapter_2.oneDimensionalArrays;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrayA = new int[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = sc.nextInt();
        }
        int sum = findSum(arrayA, k);
        System.out.println(sum);
    }

    private static int findSum(int[] arrayA, int k) {
        int sum = 0;
        for (int i : arrayA) {
            if (i % k == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
