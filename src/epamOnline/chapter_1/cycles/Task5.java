package epamOnline.chapter_1.cycles;

// Даны числовой ряд и некоторое число е.
// Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид:

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        double sum = 0;
        double n = sc.nextInt();
        while (n != 0){
            double a = 1/Math.pow(2, n) + 1/Math.pow(3, n);
            if (Math.abs(a) >= e){
                sum += a;
            }
            n = sc.nextInt();
        }
        System.out.println(sum);
    }
}
