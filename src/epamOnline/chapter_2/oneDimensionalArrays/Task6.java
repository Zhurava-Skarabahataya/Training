package epamOnline.chapter_2.oneDimensionalArrays;

// Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

public class Task6 {
    public static void main(String[] args) {
        double[] numbers = {2.0, 4, -8, 9.6, 0, 0, 123, 7.7, 3, 1, 6, 5, 4, 7.6};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isEven(i)) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }

    private static boolean isEven(int i) {
        if (i <= 1) {
            return false;
        }
        boolean isEven = true;
        for (int j = 2; j < i / 2 + 1; j++) {
            if (i % j == 0) {
                isEven = false;
                break;
            }
        }
        return isEven;
    }
}
