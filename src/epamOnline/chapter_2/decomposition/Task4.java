package epamOnline.chapter_2.decomposition;

//4. На плоскости заданы своими координатами n точек.
// Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        int[][] coordinates = createArrayOfCoordinates(n);
        System.out.println(findMaxDistance(coordinates));

    }

    private static double findDistance (int xa, int xb, int ya, int yb){
        return Math.sqrt((xb-xa) * (xb-xa) + (yb-ya) * (yb-ya));
    }

    private  static double findMaxDistance(int [][] array){
        double maxDistance = 0;
        int xa = 0;
        int xb = 0;
        int ya = 0;
        int yb = 0;
        for (int i = 0; i < array[0].length - 1; i++) {
            for (int j = 1; j < array[0].length - 1; j++) {
                if (findDistance(array[0][i], array[0][j], array[1][i], array[1][j]) > maxDistance){
                    maxDistance = findDistance(array[0][i], array[0][j], array[1][i], array[1][j]);
                    xa = array[0][i];
                    xb = array[0][j];
                    ya = array[1][i];
                    yb = array[1][j];
                }
            }
        }
        System.out.println(xa + " " + ya + " and " + xb + " " + yb);
        return maxDistance;
    }

    private static int[][] createArrayOfCoordinates(int n) {
        int[][] result = new int[2][n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < result[0].length; i++) {
            result[0][i] = sc.nextInt();
            result[1][i] = sc.nextInt();
        }
        return result;
    }
}
