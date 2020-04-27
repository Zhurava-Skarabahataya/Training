package epamOnline.chapter_1.linearAlgorithms;

//Task5 Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number T, please");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        boolean isPresent = false;
        if ((-2 <= x && x <= 2) && (y >= 0 && y <= 4)) {
            isPresent = true;
        } else if ((-4 <= x && x <= 4) && (y >= -3 && y <= 0)) {
            isPresent = true;
        }
        System.out.print(isPresent);
    }

}
