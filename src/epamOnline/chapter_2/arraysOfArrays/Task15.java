package epamOnline.chapter_2.arraysOfArrays;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = Morpheus.getMixedIntMatrix();
        Morpheus.printMatrix(matrix);
        System.out.println();
        int maximum = findMax(matrix);
        replaceUnevenWithMax(matrix, maximum);
        Morpheus.printMatrix(matrix);
    }

    private static void replaceUnevenWithMax(int[][] matrix, int maximum) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 == 1){
                    matrix[i][j] = maximum;
                }
            }
        }
    }

    private static int findMax(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
