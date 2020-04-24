package epamOnline.chapter_2.arraysOfArrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] matrix = new int [n][n];
        for (int i = 0; i < n; i++) {
            if (i%2 == 0 ){
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j+1;
                }
            }
            else {
                int num = n;
                for (int j = 0; j < n ; j++) {
                    matrix[i][j] = num--;
                }
            }
        }
        Morpheus.printMatrix(matrix);
    }
}
