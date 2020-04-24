package epamOnline.chapter_1.cycles;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            char c = (char) i;
            System.out.printf("%5d    %04X %20s %5s%60s %n", i, (int) c , Integer.toBinaryString(i), c, Character.getName(i));
        }
    }
}
