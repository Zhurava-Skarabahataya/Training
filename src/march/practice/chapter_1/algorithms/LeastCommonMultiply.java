package march.practice.chapter_1.algorithms;

public class LeastCommonMultiply {
    static int[] array = {3, 9, 36};

    public static void main(String[] args) {
        int commonMultiply = 1;
        int max = findmax();
        for (int i = max; ; i++) {
            boolean delim = true;
            for (int index = 0; index < array.length; index++) {
                if (i% array[index] != 0 ){
                    delim = false;
                }
            }
            if (delim){
                commonMultiply = i;
                break;
            }
        }
        System.out.printf("%d", commonMultiply);
    }

    private static int findmax() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

}
