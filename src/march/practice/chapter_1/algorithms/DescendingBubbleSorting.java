package march.practice.chapter_1.algorithms;

class DescendingBubbleSorting {

    public static void main(String[] args) {

        int[] array = {6, 3, 8, 1,-5, 2, 8, -10, 8, 8};
        boolean switches = true;
        do {
            switches = false;
            for (int i = 0; i < array.length-1; i++) {
                if (Math.abs(array[i]) > Math.abs(array[i+1])) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = temp;
                    switches = true;
                }
            }
        }
        while (switches);
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }
}
