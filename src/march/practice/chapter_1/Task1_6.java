package march.practice.chapter_1;

public class Task1_6 {
    
    static int [] array = {100, 454, 77, 673, 1000, 7592};

    public static void main(String[] args) {
        for (int i : array) {
            if ( i/1000 ==0 && i/100 >0){
                int first = i/100;
                int second = i/10 - first*10;
                int third = i - first*100 - second*10;
                if(first != second && first != third && second != third){
                    System.out.printf("%d ", i);
                }
            }
        }
    }

}
