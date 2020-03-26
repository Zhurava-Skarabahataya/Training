package march.practice.StepickAlgorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

class Pisano {
    private static final int MOD = (int) (1e9 + 7);

    private static int fibonacci(int n){
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            int c = (a+b) % MOD;
            a=b;
            b=c;
        }
        return a;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
        int n = 1025;
        int m = 55;
        long start = System.currentTimeMillis();
        int h = fibonacci(n);
        System.out.println("fibb "+n + " =" + (h));
        System.out.println(h % m);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }
}
