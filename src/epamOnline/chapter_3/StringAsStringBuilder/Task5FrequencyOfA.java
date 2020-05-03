package epamOnline.chapter_3.StringAsStringBuilder;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5FrequencyOfA {
    public static void main(String[] args) {
        String myString = "Abraham Abigail is ambient.";
        Pattern p = Pattern.compile("[aAаА]");
        Matcher m = p.matcher(myString);
        int counter = 0;
        while (m.find()){
            counter++;
        }
        System.out.println(counter);
    }
}
