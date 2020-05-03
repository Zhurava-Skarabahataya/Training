package epamOnline.chapter_3.StringAsStringBuilder;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class Task2BafterA {
    public static void main(String[] args) {
        String myString = "Abraham Abigeil is ambient.";
        myString = myString.replaceAll("([Aa]{1})", "$1b");
        System.out.println(myString);
    }
}
