package epamOnline.chapter_1.linearAlgorithms;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number T, please");
        long x = sc.nextLong();
        int hours = (int) (x / 3600);
        int mins = (int) (x % 3600 / 60);
        int secs = (int) (x % 60);
        System.out.printf("%d%s %d%s %d%s", hours, "ч", mins, "мин", secs, "с.");
    }

}
