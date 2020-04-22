package epamOnline.chapter_1.cycles;

// 1. Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number, please");
        int a = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= a){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
