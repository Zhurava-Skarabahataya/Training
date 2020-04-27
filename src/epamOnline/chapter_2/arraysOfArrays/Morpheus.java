package epamOnline.chapter_2.arraysOfArrays;

public class Morpheus {

    static void printMatrix (int[][] matrix){
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    static void printMatrix (double[][] matrix){
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(doubles[j] + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("SameParameterValue")
    static int generateNumber(int from, int to){
        return (int)(Math.random()*(to-from+1) + from);
    }

    static int[][] getPositiveIntMatrix (){
        return  new int[][] {{9, 3, 5, 7, 9}, {1, 2, 3, 3, 5}, {4, 6, 3, 2, 1}, {1, 1, 1, 1, 1}, {4, 5, 6, 7, 8}};
    }

    static int[][] getMixedIntMatrix (){
        return  new int[][] {{-9, 3, 5, 7, 9}, {1, 2, -3, 3, 5}, {4, -6, 3, 2, 1}, {1, 1, 1, -1, 1}, {4, 5, 6, 7, 8}};
    }

}
