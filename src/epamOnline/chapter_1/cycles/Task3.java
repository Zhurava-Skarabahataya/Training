package epamOnline.chapter_1.cycles;

//3. Найти сумму квадратов первых ста чисел

public class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100){
            sum += count * count;
            count++;
        }
        System.out.println(sum);
    }
}
