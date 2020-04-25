package epamOnline.chapter_2.arraysOfArrays;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = Morpheus.getMixedIntMatrix();
        Scanner sc = new Scanner(System.in);
        Morpheus.printMatrix(matrix);
        int k = sc.nextInt()-1;
        int p = sc.nextInt() -1;
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[k][i]+" ");
        }
        System.out.println();
        for (int[] ints : matrix) {
            System.out.println(ints[p]);
        }
    }
}
