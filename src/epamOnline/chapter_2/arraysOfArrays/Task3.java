package epamOnline.chapter_2.arraysOfArrays;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = {{9, 3, 5, 7, 9}, {1, 2, 3, 3, 5}, {4, 6, 3, 2, 1}, {1, 1, 1, 1, 1}, {4, 5, 6, 7, 8}};
        Scanner sc = new Scanner(System.in);
        Morpheus.printMatrix(matrix);
        int k = sc.nextInt()-1;
        int p = sc.nextInt() -1;
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(matrix[k][i]+" ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][p]);
        }
    }
}
