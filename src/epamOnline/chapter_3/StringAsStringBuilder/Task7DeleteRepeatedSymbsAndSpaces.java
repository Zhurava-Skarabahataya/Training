package epamOnline.chapter_3.StringAsStringBuilder;

public class Task7DeleteRepeatedSymbsAndSpaces {
    public static void main(String[] args) {
        String myString = "I love rock'n'roll oh yeeeeah";
        String result = deleteSpacesAndDuplicatesSymbols(myString);
        System.out.println(result);
    }

    private static String deleteSpacesAndDuplicatesSymbols(String myString) {
        myString = myString.replace(" ", "");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            String sub = myString.substring(i, i+1);
            if (!result.toString().contains(sub)){
                result.append(sub);
            }
        }
        return result.toString();
    }
}
