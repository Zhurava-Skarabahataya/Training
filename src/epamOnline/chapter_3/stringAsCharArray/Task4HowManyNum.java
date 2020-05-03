package epamOnline.chapter_3.stringAsCharArray;

//4. В строке найти количество чисел.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4HowManyNum {
    public static void main(String[] args) {
        String myString = "I have a 23 chikens and 20 cows and 1 big fat pig.";
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(myString);
        int numberCount = 0;
        while (m.find()){
            numberCount++;
        }
        System.out.println(numberCount);
    }
}
