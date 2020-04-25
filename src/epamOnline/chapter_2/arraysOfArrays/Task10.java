package epamOnline.chapter_2.arraysOfArrays;

//10. Найти положительные элементы главной диагонали квадратной матрицы.

public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = Morpheus.getMixedIntMatrix();
        // Morpheus.printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0){
                System.out.println(matrix[i][i]);
            }
        }
    }
}
