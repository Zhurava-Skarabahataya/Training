package epamOnline.chapter_3.stringAsCharArray;

//4. В строке найти количество чисел.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4HowManyNum {
    public static void main(String[] args) {
        String myString = "I have a 23 chikens and 20 cows and 1 big fat pig.45";
        countNumbersWay1(myString);
        countNumbersWay2(myString);
    }

    private static void countNumbersWay2(String myString) {
        char[] array = myString.toCharArray();
        int counter =0;
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])){
                counter++;
                while (i+1 <= array.length -1){
                    i++;
                    if (!Character.isDigit(array[i])){
                        break;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    private static void countNumbersWay1(String myString) {
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(myString);
        int numberCount = 0;
        while (m.find()){
            numberCount++;
        }
        System.out.println(numberCount);
    }
}
