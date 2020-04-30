package epamOnline.chapter_2.decomposition;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 

public class Task7 {
    public static void main(String[] args) {
        int factSum = findSumOfFact();
        System.out.println(factSum);
    }

    private static int findSumOfFact() {
        int result = 0;
        for (int k = 1; k <= 9; k++) {
            if (k%2 == 1){
                result += findFactorial(k);
            }
        }
        return result;
    }
    
    private static int findFactorial(int i){
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
            factorial *= j;
        }
        return factorial;
    }

}
