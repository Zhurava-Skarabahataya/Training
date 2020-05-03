package epamOnline.chapter_3.stringAsCharArray;

//3. В строке найти количество цифр

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3HowManyNumerals {
    public static void main(String[] args) {
        String myString = "London is the cap1ta1 0f Great Br1ta1n";
        countNumeralsWay1(myString);
        countNumeralsWay2(myString);
    }

    private static void countNumeralsWay2(String myString) {
        int counter = 0;
        char [] array = myString.toCharArray();
        for (char c : array) {
            if (Character.isDigit(c)){
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void countNumeralsWay1(String myString) {
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(myString);
        int numberCount = 0;
        while (m.find()){
            numberCount++;
        }
        System.out.println(numberCount);
    }
}
