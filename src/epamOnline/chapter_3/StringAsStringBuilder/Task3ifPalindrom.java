package epamOnline.chapter_3.StringAsStringBuilder;

//3. Проверить, является ли заданное слово палиндромом.

public class Task3ifPalindrom {
    public static void main(String[] args) {
        String a = "Efofe";
        String b = "Tim";
        String c = "УНИТАЗЗАТИНУ";

        checkIfPalindrom(a);
        checkIfPalindrom(b);
        checkIfPalindrom(c);
    }

    private static void checkIfPalindrom(String a) {
        a = a.toLowerCase();
        StringBuilder viceVersa = new StringBuilder();
        for (int i = a.length()-1; i >=0 ; i--) {
            viceVersa.append(Character.toLowerCase(a.charAt(i)));
        }
        if (a.equals(viceVersa.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
