package march.practice.chapter_1;

import java.util.Scanner;

public class BiggestCommonDivisor {
    static int[] array = {15, 27, 12, 36};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = biggestCommonDiv(18, 63967072);
        System.out.println(d);
    }

    static int biggestCommonDiv(int one, int two) {
        if (one == 0) {
            return two;
        }
        if (two == 0) {
            return one;
        }
        if (one >= two) {
            return biggestCommonDiv(one%two, two);
        }
        else {
            return biggestCommonDiv(one, two%one);
        }
    }

    private static int findMin() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

}
