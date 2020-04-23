package epamOnline.chapter_1.cycles;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task8 {

    static  Set<Integer> setOfNums = new HashSet<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a!=0){
            int digit = a%10;
            checkIfContains(digit , b);
            a /= 10;
        }
        for (Integer t : setOfNums){
            System.out.println(t);
        }
    }

    private static void checkIfContains(int digit, int b) {
        while (b!=0){
            int myDig = b%10;
            if (myDig == digit){
                setOfNums.add(myDig);
                break;
            }
            b /= 10;
        }
    }


}
