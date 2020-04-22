package epamOnline.chapter_1.branches;

//   Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
//   Определить, пройдет ли кирпич через отверстие.

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates for A, B, x, y and z, please");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        double minSideHole = Math.min(a, b);
        double maxSideHole = Math.max(a, b);
        double[] brick = {x, y, z};
        Arrays.sort(brick);
        if (minSideHole >= brick[0] && maxSideHole >= brick[1]){
            System.out.println("Пролезет");
        }
        else {
            System.out.println("Не пролезет");
        }

    }

}
