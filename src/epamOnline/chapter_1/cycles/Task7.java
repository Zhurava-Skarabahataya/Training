package epamOnline.chapter_1.cycles;

//Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            printDelims(i);
        }
    }

    private static void printDelims(int i) {
        System.out.print("For " + i + ": ");
        boolean noDelims = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0){
                System.out.print(j + " ");
                noDelims = false;
            }
        }
        if (noDelims){
            System.out.print("no delimiters.");
        }
        System.out.println();
    }
}
