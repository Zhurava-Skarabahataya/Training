package epamOnline.chapter_2.sortings;

//8.Даны дро,( i i q p , - натуральные).
// Составить программу, которая приводит эти дроби к общему знаменателю
// и упорядочивает их в порядке возрастания.

public class Task8 {
    public static void main(String[] args) {
        int[] p = {3, 1, 6, 15};
        int[] q = {4, 2, 7, 17};
        int denominator = findDenominator(q);
        System.out.println("Общий знаменатель " + denominator);
        for (int i = 0; i < p.length; i++) {
            p[i] = p[i] * (denominator / q[i]);
        }
        boolean switches = true;
        while (switches){
            switches = false;
            for (int i = 0; i < p.length-1; i++) {
                if (p[i] > p[i+1]){
                    int temp = p[i];
                    p[i] = p[i+1];
                    p[i+1] = temp;
                    temp = q[i];
                    q[i] = q[i+1];
                    q[i+1] = temp;
                    switches = true;
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            p[i] = p[i]/(denominator/q[i]);
            System.out.println(p[i] + "/" + q[i]);
        }
    }

    private static int findDenominator(int[] q) {
        int a = 0;
        boolean isFound = false;
        while (!isFound){
            a++;
            isFound = true;
            for (int value : q) {
                if (a % value != 0) {
                    isFound = false;
                    break;
                }
            }
        }
        return a;
    }
}
