package epamOnline.chapter_2.arraysOfArrays;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Task11 {
    public static void main(String[] args) {
        int [][] matrix = new int [10][20];
        for (int i = 0; i < matrix.length; i++) {
            int fiveCounter = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Morpheus.generateNumber(0, 15);
                if (matrix[i][j]==5){
                    fiveCounter++;
                }
            }
            if (fiveCounter >=3){
                System.out.println("Строка " + i);
            }
        }
        Morpheus.printMatrix(matrix);
    }
}
