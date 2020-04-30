package epamOnline.chapter_2.decomposition;

public class ArrayManager {

    static int[] getAnArrayOf (int n){
        int [] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = generateNumber(1, 100);
        }
        return result;
    }

    static int generateNumber(int from, int to){
        return (int)(Math.random()*(to-from+1) + from);
    }

}
