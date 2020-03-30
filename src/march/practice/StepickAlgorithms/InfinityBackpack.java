package march.practice.StepickAlgorithms;

import java.util.Locale;
import java.util.Scanner;

public class InfinityBackpack {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        double finalValue = 0;
        int whatIsInBackpack = 0;
        double[][] products = new double[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                products[i][j] = sc.nextDouble();
            }
        }
        sortMatrix(products, n);
        for (double[] line : products) {
            for (double i : line) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (double[] product : products) {
            if (capacity <= 0) {
                break;
            } else if (capacity > product[1]) {
                capacity -= product[1];
                System.out.println("capacity " + capacity);
                finalValue += product[0];
                System.out.println("добавлего " + finalValue);
            } else if (capacity <= product[1]) {
                finalValue += capacity * (product[0] / product[1]);
                System.out.println("добавлего " + finalValue);
                capacity = 0;

            }
        }
        System.out.printf(Locale.ENGLISH, "%.3f", finalValue);
    }

    private static void sortMatrix(double[][] lines, int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < lines.length - 1; i++) {
                if (lines[i][0]/lines[i][1] < lines[i + 1][0] / lines[i+1][1]) {
                    double temp = lines[i][1];
                    double tempLeft = lines[i][0];
                    lines[i][1] = lines[i + 1][1];
                    lines[i][0] = lines[i + 1][0];
                    lines[i + 1][1] = temp;
                    lines[i + 1][0] = tempLeft;
                }
            }

        }
    }
}
