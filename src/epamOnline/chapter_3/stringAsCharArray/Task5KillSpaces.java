package epamOnline.chapter_3.stringAsCharArray;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class Task5KillSpaces {
    public static void main(String[] args) {
        String myString = "   London   is the      capital  of Great Britain.         ";
        String regex = "( )+";
        myString = myString.replaceAll(regex, " ").trim();
        System.out.println(myString);
    }
}
