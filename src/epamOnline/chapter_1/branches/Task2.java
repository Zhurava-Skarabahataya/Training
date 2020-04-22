package epamOnline.chapter_1.branches;

// Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c and d, please");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));
    }

}
