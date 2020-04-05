package march.practice.StepickAlgorithms;

import java.util.Scanner;

public class EditingDistance {

    String first;
    String second;
    int[][] d;
    boolean[][] isCalculated;

    public static void main(String[] args) {
        new EditingDistance().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
         first = sc.next();
         second = sc.next();
         d = new int[first.length()+1][second.length()+1];
         isCalculated = new boolean[first.length()+1][second.length()+1];
        System.out.println(editingDist(first.length(), second.length()));

    }

    int editingDist (int n, int m){
        if (n==0 && m==0){
            return 0;
        }
        if (n==0){
            return m;
        }
        if (m==0){
            return n;
        }
        if (isCalculated[n][m]){
            return d[n][m];
        }
        int result1 = editingDist(n, m-1) + 1;
        int result2 = editingDist(n- 1, m) + 1;
        int result3 = editingDist(n- 1, m- 1) + (first.charAt(n-1)
                == second.charAt(m-1) ? 0 : 1);
        int result = Math.min(result1, Math.min(result2, result3));
        isCalculated[n][m] = true;
        d [n][m] = result;
        return result;
    }

}
