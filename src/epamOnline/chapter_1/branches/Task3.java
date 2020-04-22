package epamOnline.chapter_1.branches;

//  Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates for A, B, C, please");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("На одной прямой");
        }
        else {
            System.out.println("Не на одной прямой");
        }
    }

}
