package epamOnline.chapter_2.decomposition;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

public class Task9 {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        int z = 3;
        int t = 6;
        double square = findSquare(x, y, z, t);
        System.out.println(square);
    }

    private static double findSquare(int x, int y, int z, int t) {
        double hipotenusa = Math.sqrt(x*x + y*y);
        double square1 = 0.5 * x * y;
        double p = (hipotenusa + z + t)/2;
        double square2 = Math.sqrt(p * (p-hipotenusa) * (p- z) * (p-t));
        return square1 + square2;
    }

}
