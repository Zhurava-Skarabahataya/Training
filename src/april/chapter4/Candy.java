package april.chapter4;

import java.text.ParseException;

public abstract class Candy implements Buyable {
    public static void main(String[] args) throws ParseException {
        StringBuilder a = new StringBuilder("TTT");
        StringBuilder b = new StringBuilder(a);
        System.out.println(b);

    }


}
