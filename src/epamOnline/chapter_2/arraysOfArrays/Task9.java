package epamOnline.chapter_2.arraysOfArrays;

//9. Задана матрица неотрицательных чисел.
// Посчитать сумму элементов в каждом столбце.
// Определить, какой столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        int[][] matrix = Morpheus.getPositiveIntMatrix();
        int maxSum = 0;
        int columnNumber = 0;
        Morpheus.printMatrix(matrix);
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                columnNumber = j;
            }
        }
        System.out.println(columnNumber + 1 + " стоблик");
    }
}
