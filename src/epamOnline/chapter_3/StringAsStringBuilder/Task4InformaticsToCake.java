package epamOnline.chapter_3.StringAsStringBuilder;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4InformaticsToCake {
    public static void main(String[] args) {
        String informatics = "информатика";
        String o = String.copyValueOf(informatics.toCharArray(), 3, 1);
        String t = String.copyValueOf(informatics.toCharArray(), 7, 1);
        String r = String.copyValueOf(informatics.toCharArray(), 4, 1);
        String cake = t.concat(o.concat(r.concat(t)));
        System.out.println(cake);
    }
}
