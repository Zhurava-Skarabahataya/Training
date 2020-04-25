package epamOnline.chapter_2.arraysOfArrays;

public class Sorter {

    static void sortArrayReverse(int[] array){
        boolean switches = true;
        while (switches){
            switches = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    switches = true;
                }
            }

        }
        //return array;

    }
}
