package epamOnline.chapter_2.decomposition;

//13. Два простых числа называются «близнецами»,
// если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n],
// где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

public class Task13 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = n; i <= 2*n - 2; i++) {
            System.out.println(i + " " + (i+2));
        }
    }
}
