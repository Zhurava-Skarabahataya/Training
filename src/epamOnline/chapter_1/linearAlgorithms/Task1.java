package epamOnline.chapter_1.linearAlgorithms;

// Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c, please");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
    }

}
