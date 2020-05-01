package epamOnline.chapter_2.decomposition;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию.

public class Task14 {
    public static void main(String[] args) {
        int k = 25000000;
        for (int i = 1; i <= k; i++) {
            if (checkNumber(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean checkNumber (int n){
        if ( findSumOfDigits(n) == n){
            return true;
        }
        else {
            return false;
        }
    }

    private static int findHowManyDigits (int n){
        return String.valueOf(n).length();
    }

    private static int findSumOfDigits(int n) {
        int sumOfDigits = 0;
        int power = findHowManyDigits(n);
        while (n != 0) {
            int digit = n % 10;
            sumOfDigits += Math.pow(digit, power);
            n /= 10;
        }
        return sumOfDigits;
    }
}
