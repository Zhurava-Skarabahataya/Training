package epamOnline.chapter_2.decomposition;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2GCDForFour {
    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        int c = 20;
        int d = 40;
        int e = findGcd(findGcd(a, b), findGcd(c, d));
        System.out.println(e);
    }


    private static int findGcd(int a, int b) {
        return (b == 0) ? a : findGcd(b, a%b);
    }
}
