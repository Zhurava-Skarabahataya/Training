package march.practice.chapter_1;

public class BiggestCommonDivisor {
    static int[] array = {15, 27, 12, 36};

    public static void main(String[] args) {
        int delim = 1;
        int min = findMin();
        for (int i = min; i >0 ; i--) {
            boolean deliable = true;
            for (int index = 0; index < array.length; index++) {
                if (array[index] % i != 0){
                    deliable = false;
                }
            }
            if (deliable){
                delim = i;
                break;
            }
        }
        System.out.printf("%d", delim);
    }

    private static int findMin() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
