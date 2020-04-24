package epamOnline.chapter_2.arraysOfArrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]matrix = new int [n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i+1;
            }
            n--;
        }
        Morpheus.printMatrix(matrix);
    }
}
