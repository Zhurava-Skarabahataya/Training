package epamOnline.chapter_1.branches;

//1. Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b, please");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a+b < 180){
            System.out.println("Существует");
            if (a == 90 || b == 90 || a+b == 90){
                System.out.println("Прямоугольный");
            }
            else {
                System.out.println(" Не прямоугольный");
            }
        }
        else {
            System.out.println("Не существует");
        }
    }

}
