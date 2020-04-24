package epamOnline.chapter_2.oneDimensionalArrays;

//Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task3 {
    public static void main(String[] args) {
        double[] numbers = {2.0, 4, -8, 9.6, 0, 0, 123};
        int negative = 0;
        int positive = 0;
        int nul = 0;
        for (double number : numbers) {
            if (number > 0){
                positive++;
            }
            else if (number == 0){
                nul++;
            }
            else {
                negative++;
            }
        }
        System.out.println("Отрицательных: " + negative);
        System.out.println("Положительных: " + positive);
        System.out.println("Нулевых: " + nul);
    }
}
