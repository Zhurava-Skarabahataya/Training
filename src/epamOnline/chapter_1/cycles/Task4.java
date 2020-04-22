package epamOnline.chapter_1.cycles;

//4. Составить программу нахождения произведения квадратов первых двухсот чисел

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        BigInteger mul = new BigInteger(1);
        int count = 1;
        while (count <= 200){
            mul = mul.multiply(mul = count * count;
            System.out.println(mul);
            count++;
        }
        System.out.println(mul);
    }
}
