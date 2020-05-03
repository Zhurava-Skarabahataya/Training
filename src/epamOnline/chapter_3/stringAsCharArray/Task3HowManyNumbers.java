package epamOnline.chapter_3.stringAsCharArray;

//3. В строке найти количество цифр

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3HowManyNumbers {
    public static void main(String[] args) {
        String myString = "London is the cap1ta1 0f Great Br1ta1n";
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(myString);
        int numberCount = 0;
        while (m.find()){
            m.group();
            numberCount++;
        }
        System.out.println(numberCount);
    }
}
