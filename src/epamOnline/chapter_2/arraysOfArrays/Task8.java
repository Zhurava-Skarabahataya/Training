package epamOnline.chapter_2.arraysOfArrays;

//8. В числовой матрице поменять местами два столбца любых столбца,
// т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
// а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[][] matrix = Morpheus.getMixedIntMatrix();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() -1;
        int b = sc.nextInt() -1;
        Morpheus.printMatrix(matrix);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] = temp;
        }
        Morpheus.printMatrix(matrix);
    }

}
