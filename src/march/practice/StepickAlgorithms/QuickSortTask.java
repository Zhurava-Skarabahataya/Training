package march.practice.StepickAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortTask {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new QuickSortTask().run();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] starts = new int[n];
        int []ends = new int[n];
        int [] points = new int[m];
        for (int i = 0; i < n; i++) {
            starts[i] = sc.nextInt();
            ends[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            points[i] = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(starts);
        Arrays.sort(ends);
        for (int point : points) {
            int start = 0;
            int end = 0;
            int st = searchInStarts(point, starts);

            for (int i = 0; i < ends.length; i++) {
                if (ends[i] < point){
                    end++;
                }
                else{
                    break;
                }
            }
            sb.append(st-end);
            sb.append(" ");
        }
        System.out.println(sb);


    }

    private int searchInStarts(int point, int[] starts) {
        int st = 0;
        int left = 0;
        int rigth = starts.length - 1;
        while (rigth >= left){
            int medInd = (rigth + left) / 2;
            if (starts[medInd]<= point){
                left = medInd + 1;
                st +=  1;
            }
            if (starts[medInd] > point){
                rigth = medInd - 1;
            }
        }


        return st;
    }


}
