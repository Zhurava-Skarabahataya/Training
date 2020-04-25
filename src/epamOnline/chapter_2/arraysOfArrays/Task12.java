package epamOnline.chapter_2.arraysOfArrays;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int [][] matrix = Morpheus.getMixedIntMatrix();
        //Morpheus.printMatrix(matrix);
        for (int[] ints : matrix) {
            Arrays.sort(ints);
        }
        Morpheus.printMatrix(matrix);
        for (int[] ints : matrix) {
            Sorter.sortArrayReverse(ints);
        }
        System.out.println();
        Morpheus.printMatrix(matrix);

    }


}
