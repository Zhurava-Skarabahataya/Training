package epamOnline.chapter_1.linearAlgorithms;

//Вычислить значение выражения по формуле
// (все переменные принимают действительные значения):
// 𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦 𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦 ∗ 𝑡𝑔 𝑥𝑦

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y, please");
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println(z);
    }

}
