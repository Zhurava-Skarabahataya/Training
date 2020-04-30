package epamOnline.chapter_2.decomposition;

//10. Дано натуральное число N.
// Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int n = 12543;
        int [] digits = new int[(String.valueOf(n)).length()];
        int counter = digits.length - 1;
        while (n!=0){
            digits[counter--] = n%10;
            n /= 10;
        }
        System.out.println(Arrays.toString(digits));
    }
}
