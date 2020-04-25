package epamOnline.chapter_2.arraysOfArrays;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали

public class Task2 {
    public static void main(String[] args) {
        int[][] matrix = Morpheus.getMixedIntMatrix();
        Morpheus.printMatrix(matrix);
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            System.out.println(matrix[i][j]);
        }
    }
}
