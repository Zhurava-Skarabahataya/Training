package epamOnline.chapter_1.branches;

//   Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//   Определить, пройдет ли кирпич через отверстие.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x, please");
        double x = sc.nextDouble();
        double result;
        if (x <= 3) {
            result = x*x - 3*x + 9;
        }
        else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(result);
    }

}
