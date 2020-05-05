package epamOnline.chapter_3.StringAsStringBuilder;

public class Task8LongestWord {
    public static void main(String[] args) {
        String myString = "I love rock'n'roll oh yeeeeah";
        String theLongestWord = findTheLongestWord(myString);
        System.out.println(theLongestWord);
    }

    private static String findTheLongestWord(String myString) {
        String[] words = myString.split(" ");
        int maxLength = 0;
        String theWord = "";
        for (String word : words) {
            if (word.length() > maxLength){
                maxLength = word.length();
                theWord = word;
            }
        }
        return theWord;
    }
}
