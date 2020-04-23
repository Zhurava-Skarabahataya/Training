package epamOnline.chapter_1.cycles;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a!=0){
            int digit = a%10;
            checkIfContains(digit , b);
            a = a/10;
        }
    }

    private static void checkIfContains(int digit, int b) {
        while (b!=0){
            int myDig = b%10;
            if (myDig == digit){
                System.out.println(myDig);
                break;
            }
            b = b/10;
        }
    }


}
