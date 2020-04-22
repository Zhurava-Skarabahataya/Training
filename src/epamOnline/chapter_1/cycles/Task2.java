package epamOnline.chapter_1.cycles;

//Вычислить значения функции на отрезке [а,b] c шагом h:

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and h, please");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double result;
        for (double i = a; i <= b; i += h) {
            if (i>2) {
                result = i;
                System.out.println(result);
            }
            else {
                result = -i;
                System.out.println(result);
            }
        }
    }

}
