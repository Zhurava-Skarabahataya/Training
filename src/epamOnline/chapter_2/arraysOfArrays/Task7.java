package epamOnline.chapter_2.arraysOfArrays;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] matrix = new double[n][n];
        int positive = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Math.sin((i*i - j*j)/n);
                if (matrix[i][j] > 0){
                    positive++;
                }
            }
        }
        Morpheus.printMatrix(matrix);
        System.out.println("Positive numbers total " + positive);
    }
}
