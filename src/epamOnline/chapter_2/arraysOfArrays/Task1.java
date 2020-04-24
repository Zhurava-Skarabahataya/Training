package epamOnline.chapter_2.arraysOfArrays;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = {{9, 3, 5, 7, 9}, {1, 2, 3, 3, 5}, {4, 6, 3, 2, 1}, {1, 1, 1, 1, 1}, {4, 5, 6, 7, 8}};
        Morpheus.printMatrix(matrix);
        System.out.println();
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(ints[j] + " ");
                }
            }
            System.out.println();
        }

        //Для отдельного отображения столбцов:

//        for (int j = 0; j < matrix[0].length; j += 2) {
//            if (matrix[0][j] > matrix[matrix.length-1][j]){
//                for (int i = 0; i < matrix.length; i++) {
//                    System.out.print(matrix[i][j]+ "\n");
//                }
//                System.out.println();
//            }
//        }
    }
}
