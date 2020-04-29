package epamOnline.chapter_2.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя 
// и наименьшего общего кратного двух натуральных чисел

public class Task1GcdAndLcm {
    public static void main(String[] args) {
        int a = 15;
        int b = 6;
        int gcd = findGcd(a, b);
        System.out.println("Наибольший общий делитель " + gcd);
        int lcm = findLcm (a, b);
        System.out.println("Наименьшее общее кратное " + lcm);
    }

    private static int findLcm(int a, int b) {
        return a*b / findGcd(a, b);
    }

    private static int findGcd(int a, int b) {
        return (b == 0) ? a : findGcd(b, a%b);
    }
}
