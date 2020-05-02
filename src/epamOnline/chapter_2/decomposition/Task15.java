package epamOnline.chapter_2.decomposition;

//15. Найти все натуральные n-значные числа, цифры в которых образуют
// строго возрастающую последовательность (например, 1234, 5789).
// Для решения задачи использовать декомпозицию.

public class Task15 {
    public static void main(String[] args) {
        int n = 4;
        findAllInreasing(n);
    }

    private static void findAllInreasing(int n) {
        int end = findMaxOfnNumbers(n);
        int start = findMinOfnNumbers(n);
        for (int i = start; i <= end; i++) {
            if (checkIfIncreasing(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkIfIncreasing(int i) {
        int prevDigit = i % 10;
        i /= 10;
        while (i != 0) {
            int digit = i % 10;
            if (digit >= prevDigit) {
                return false;
            }
            i /= 10;
            prevDigit = digit;
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
