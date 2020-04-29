package epamOnline.chapter_2.sortings;

//7. Пусть даны две неубывающие последовательности действительных чисел m n b
// bbиaaa     21 21
//.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
// m bb b   2 1 в первую последовательность так,
// чтобы новая последовательность оставалась возрастающей.
//

public class Task7 {
    public static void main(String[] args) {
        int[] arrayA = {2, 5, 6, 8, 10, 12};
        int[] arrayB = {0, 1, 3, 5, 8, 15};
        mergingArrays(arrayA, arrayB);
    }

    static void mergingArrays(int[] firstArray, int[] secondArray) {
        int newLength = firstArray.length + secondArray.length;
        int firstArrIndex = 0;
        int secondArrIndex = 0;
        for (int i = 0; i < newLength; i++) {
            if (firstArrIndex >= firstArray.length && secondArrIndex < secondArray.length) {
                secondArrIndex++;
                System.out.print(firstArrIndex + " ");
                continue;
            }
            if (secondArrIndex >= secondArray.length && firstArrIndex < firstArray.length) {
                firstArrIndex++;
                continue;
            }
            if (firstArray[firstArrIndex] <= secondArray[secondArrIndex]) {
                firstArrIndex++;
            } else {
                secondArrIndex++;
                System.out.print(firstArrIndex + " ");
            }
        }
    }
}
