package epamOnline.chapter_3.stringAsCharArray;

//2. Замените в строке все вхождения 'word' на 'letter'.

public class Task2WordToLetter {
    public static void main(String[] args) {
        String myString = "Word, oh my word, such a great great word.";
        myString = myString.replaceAll("word", "letter").replaceAll("Word", "Letter");
        System.out.println(myString);
    }
}
