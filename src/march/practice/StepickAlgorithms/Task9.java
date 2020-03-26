package march.practice.StepickAlgorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] lines = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                lines[i][j] = sc.nextInt();
            }
        }
        sortMatrix(lines, n);
        for (int[] line : lines) {
            for (int i : line) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        boolean needInNewPoint = true;
        List<Integer> points = new ArrayList<>();
        points.add(lines[0][1]);
        while (needInNewPoint){
            needInNewPoint = false;
            for (int i = 1; i < lines.length; i++) {
                int lastPoint = points.get(points.size()-1);
                if (lastPoint < lines[i][0]){
                    needInNewPoint = true;
                    points.add(lines[i][1]);
                    break;
                }
            }
        }
        System.out.println(points.size());
        for (Integer point : points) {
            System.out.print(point + " ");
        }
    }

    private static void sortMatrix(int[][] lines, int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < lines.length - 1; i++) {
                if (lines[i][1] > lines[i + 1][1]) {
                    int temp = lines[i][1];
                    int tempLeft = lines[i][0];
                    lines[i][1] = lines[i + 1][1];
                    lines[i][0] = lines[i + 1][0];
                    lines[i + 1][1] = temp;
                    lines[i + 1][0] = tempLeft;
                }
            }

        }
    }
}
