package epamOnline.chapter_2.arraysOfArrays;

//16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
// составленная из чисел 1, 2, 3, ..., 2 n так, что суммы по каждому столбцу,
// каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат. Пример магического квадрата порядка 3:

public class Task16 {
    public static void main(String[] args) {
        int n = 3;
        int[][] magicMatrix = new int[n][n];
        int sum = 0;
        for (int i = 1; i <= n * n; i++) {
            sum += i;
        }
        sum = n * (n * n + 1) / 2;
        System.out.println(sum);
        int row = n / 2;
        int col = n - 1;
        int number = 1;
        while (number <= n * n) {
            if (row == -1 && col == n) {
                row = 0;
                col = n - 2;
            } else {
                if (col == n) {
                    col = 0;
                }
                if (row < 0) {
                    row = n - 1;
                }
            }
            if (magicMatrix[row][col] != 0) {
                col -= 2;
                row++;
            } else {
                magicMatrix[row][col] = number++;
                col++;
                row--;
            }


        }
//
        Morpheus.printMatrix(magicMatrix);
    }
}
