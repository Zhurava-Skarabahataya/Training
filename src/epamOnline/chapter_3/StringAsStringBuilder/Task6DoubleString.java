package epamOnline.chapter_3.StringAsStringBuilder;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6DoubleString {
    public static void main(String[] args) {
        String myString = "I love rock'n'roll";
        String doubledString = doubleString(myString);
        System.out.println(doubledString);
    }

    private static String doubleString(String myString) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            for (int j = 0; j < 2; j++) {
                result.append(myString.charAt(i));
            }
        }
        return result.toString();
    }
}
