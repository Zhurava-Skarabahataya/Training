package epamOnline.chapter_2.arraysOfArrays;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = {{9, 3, 5, 7, 9}, {1, 2, 3, 3, 5}, {4, 6, 3, 2, 1}, {1, 1, 1, 1, 1}, {4, 5, 6, 7, 8}};
        Morpheus.printMatrix(matrix);
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            System.out.println(matrix[i][j]);
        }
    }
}
