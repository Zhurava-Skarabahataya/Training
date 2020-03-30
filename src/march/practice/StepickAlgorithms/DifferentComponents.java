package march.practice.StepickAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class DifferentComponents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        ArrayList<Long> components = findComponents(n);
        System.out.println(components.size());
        for (Long component : components) {
            System.out.print(component + " ");
        }
    }

    private static ArrayList<Long> findComponents(long n) {
        ArrayList<Long> componenets = new ArrayList<>();
        if (n == 2) {
            componenets.add(2L);
            return componenets;
        }
        long minimalComponent = 1;
        while (true) {
            if (n > minimalComponent) {
                if ((1.0 * n / minimalComponent) > 2) {
                    componenets.add(minimalComponent);
                    n -= minimalComponent;
                    minimalComponent++;
                } else {
                    componenets.add(n);
                    break;
                }
            } else {
                componenets.add(minimalComponent);
                break;
            }
        }
        return componenets;
    }

}
