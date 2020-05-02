package epamOnline.chapter_2.decomposition;

//17. Из заданного числа вычли сумму его цифр.
// Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль?
// Для решения задачи использовать декомпозицию.

public class Task17 {
    static int amountOfOperations = 0;

    public static void main(String[] args) {
        int number = 17856;
        findAmountOfOperations(number);
        System.out.println(amountOfOperations);
    }

    private static void findAmountOfOperations(int number) {
        amountOfOperations++;
        int sum = findSumOfDigits(number);
        number -= sum;
        if (number > 0){
            findAmountOfOperations(number);
        }

    }

    private static int findSumOfDigits(int n){
        int sum = 0;
        while (n!= 0){
            int digit = n%10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
}
