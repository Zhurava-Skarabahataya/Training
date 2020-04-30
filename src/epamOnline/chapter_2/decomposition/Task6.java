package epamOnline.chapter_2.decomposition;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {
    public static void main(String[] args) {
        int a = -14;
        int b = 105;
        int c = -92;
        boolean gcdOfThree = findGCDofThree(a, b, c);
        System.out.println(gcdOfThree);
    }

    private static boolean findGCDofThree(int a, int b, int c) {
        int min = Math.min(Math.abs(a), Math.min(Math.abs(b),Math.abs(c)));
        int gcd = 2;
        while (gcd <= min ){
            if (a%gcd == 0 && b%gcd ==0 && c% gcd ==0){
                return false;
            }
            gcd++;
        }
        return true;
    }

}
