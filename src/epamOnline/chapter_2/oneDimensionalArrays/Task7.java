package epamOnline.chapter_2.oneDimensionalArrays;

// Даны действительные числа n aaa ,,, 2 1  . Найти


public class Task7 {
    public static void main(String[] args) {
        double[] numbers = {2.0, 4, -8, 9.6, 0, 0, 123, 12, 4, 9, 4, 3};
        double maxSum = numbers[0] + numbers[numbers.length - 1];
        for (int i = 0, j = numbers.length - 1; i <= j; i++, j--) {
            if (i == j){
                if (numbers[i] > maxSum){
                    maxSum = numbers[i];
                    break;
                }
            }
            if (numbers[i] + numbers[j] > maxSum){
                maxSum = numbers[i] + numbers[j];
            }

        }
        System.out.println(maxSum);

    }
}
