package epamOnline.chapter_2.arraysOfArrays;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
// причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {
    public static void main(String[] args) {
        int m = 8;
        int n = 10;
        int[][] matrix = new int[m][n];
        for (int j = 0; j < matrix[0].length; j++) {
            if (j >= matrix.length) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][j] = 1;
                }
                continue;
            }
            int[] thisColumn = oneOrNulArrayGenerator(matrix.length, j + 1);
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][j] = thisColumn[i];
            }
        }
        Morpheus.printMatrix(matrix);
    }

    static int[] oneOrNulArrayGenerator(int elements, int ones) {
        int[] array = new int[elements];
        int counter = 0;
        while (counter < ones) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = oneOrNulGererator();
                    if (array[i] == 1) {
                        counter++;
                    }
                    if (counter == ones) {
                        break;
                    }
                }
            }
        }
        return array;
    }

    static int oneOrNulGererator() {
        return (Math.random() < 0.5) ? 0 : 1;
    }
}
