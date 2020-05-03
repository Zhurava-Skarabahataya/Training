package epamOnline.chapter_3.StringAsStringBuilder;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String myString = "   London   is the      capital          of Great Britain.         ";
        countSpacesTogether(myString);
        countSpacesTogetherWay2(myString);

    }

    private static void countSpacesTogetherWay2(String myString) {
        Pattern p = Pattern.compile("( )+");
        Matcher m = p.matcher(myString);
        int maxCount =0;
        while (m.find()){
            String s = m.group();
            if (s.length() > maxCount){
                maxCount = s.length();
            }
        }
        System.out.println(maxCount);
    }

    private static void countSpacesTogether(String myString) {
        int maxSpaces = 0;
        for (int i = 0; i < myString.length(); i++) {
            int spaces = 0;
            if (myString.charAt(i) == ' '){
                spaces++;
                while (i+1 <= myString.length()-1){
                    i++;
                    if (myString.charAt(i) != ' '){
                        break;
                    }
                    spaces++;
                }
            }
            if (spaces > maxSpaces){
                maxSpaces = spaces;
            }
        }
        System.out.println(maxSpaces);
    }


}
