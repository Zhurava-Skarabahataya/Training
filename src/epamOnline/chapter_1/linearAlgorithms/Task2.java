package epamOnline.chapter_1.linearAlgorithms;

//  Вычислить значение выражения по формуле
//  (все переменные принимают действительные значения):
//  𝑏 + √𝑏2 + 4𝑎𝑐 2𝑎 − 𝑎3𝑐 + 𝑏−2

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c, please");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double z = ((b + Math.sqrt(b*b + 4*a*c))/(2*a)-(Math.pow(a, 3)*c) + (Math.pow(b, -2)));
        System.out.println(z);
    }

}
