package epamOnline.chapter_2.arraysOfArrays;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
    public static void main(String[] args) {
        int [][] matrix = Morpheus.getMixedIntMatrix();
        ascendingSort(matrix);
        Morpheus.printMatrix(matrix);
        System.out.println();
        descendingSort(matrix);
        Morpheus.printMatrix(matrix);
    }

    static void descendingSort(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            boolean switches = true;
            while (switches){
                switches = false;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] < matrix[i+1][j]){
                        switches = true;
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i+1][j];
                        matrix[i+1][j] = temp;
                    }
                }
            }
        }
    }

    static void ascendingSort (int[][] matrix){
        for (int j = 0; j < matrix[0].length; j++) {
            boolean switches = true;
            while (switches){
                switches = false;
                for (int i = 0; i < matrix.length - 1; i++) {
                    if (matrix[i][j] > matrix[i+1][j]){
                        switches = true;
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[i+1][j];
                        matrix[i+1][j] = temp;
                    }
                }
            }
        }
    }
}
