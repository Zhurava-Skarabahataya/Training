package epamOnline.chapter_2.decomposition;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

public class Task11 {
    public static void main(String[] args) {
        int a = 376482;
        int b = 32199223;
        System.out.println(whichHasMoreDigits(a, b));
    }

    private static int whichHasMoreDigits(int a, int b) {
        return (String.valueOf(a).length() > String.valueOf(b).length()) ? a : b;
    }
}
