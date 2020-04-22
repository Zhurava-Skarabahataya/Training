package epamOnline.chapter_1.linearAlgorithms;

//Дано действительное число R вида nnn.ddd
// (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, please");
        double x = sc.nextDouble();
        int whole = (int) x;
        double frac = (x * 1000) % 1000;
        double result = (double) whole / 1000 + frac;
        System.out.println(result);
    }

}
