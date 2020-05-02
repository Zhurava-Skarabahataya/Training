package epamOnline.chapter_2.decomposition;

//16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме.
// Для решения задачи использовать декомпозицию.

public class Task16 {
    public static void main(String[] args) {
        int n = 5;
        int sumOfNumbersWithUneveDigits = findSumOfNumbersWithUnevenDigits(n);
        int howManyEvenDigitsInSum = findHowManyEvenDitigsInSum(sumOfNumbersWithUneveDigits);
        System.out.println("Сумма " +sumOfNumbersWithUneveDigits);
        System.out.println("Нечетных цифр в сумме " + howManyEvenDigitsInSum);
    }

    private static int findHowManyEvenDitigsInSum(int sumOfNumbersWithUneveDigits) {
        int countOfEvenDigits = 0;
        while (sumOfNumbersWithUneveDigits != 0){
            int digit = sumOfNumbersWithUneveDigits % 10;
            if (digit % 2 ==0){
                countOfEvenDigits++;
            }
            sumOfNumbersWithUneveDigits /= 10;
        }
        return countOfEvenDigits;
    }

    private static int findSumOfNumbersWithUnevenDigits(int n) {
        int sum = 0;
        int start = findMinOfnNumbers(n);
        int end = findMaxOfnNumbers(n);
        for (int i = start; i <= end; i++) {
            if (checkIfNumberContainsOnlyUneven(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean checkIfNumberContainsOnlyUneven(int i) {
        while (i != 0) {
            int digit = i%10;
            if (digit %2 == 0){
                return false;
            }
            i /= 10;
        }
        return true;
    }

    private static int findMinOfnNumbers(int n) {
        return (int) Math.pow(10, n - 1);
    }

    private static int findMaxOfnNumbers(int n) {
        int result = 0;
        int digit = 1;
        for (int i = 0; i < n; i++) {
            result += 9 * digit;
            digit *= 10;
        }
        return result;
    }
}
