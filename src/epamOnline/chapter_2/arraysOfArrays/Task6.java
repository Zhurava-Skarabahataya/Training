package epamOnline.chapter_2.arraysOfArrays;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int[n][n];
        int half = n/2;
        int start = 0;
        int fin = n;
        for (int i = 0; i < half; i++) {
            for (int j = start; j < fin; j++) {
                matrix[i][j] = 1;
            }
            start++;
            fin--;
        }
        for (int i = half-1; i < n; i++) {
            for (int j = start; j < fin; j++) {
                matrix[i][j] = 1;
            }
            start--;
            fin++;
        }
        Morpheus.printMatrix(matrix);
    }
}
