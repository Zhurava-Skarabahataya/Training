package march.practice.StepickAlgorithms;

import java.util.*;
import java.util.stream.Collectors;

public class HuffmanCode1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        long start = System.currentTimeMillis();
        char[] inputCharSeq = inputStr.toCharArray();
        ArrayList<Character> arrChar = new ArrayList<>();

        for (char c : inputCharSeq) {
            if (!arrChar.contains(c)){
                arrChar.add(c);
            }
        }
        Character [] uniqueChars = new Character[arrChar.size()];
        int [] charQuant = new int[uniqueChars.length];
        uniqueChars = arrChar.toArray(uniqueChars);
        for (int i = 0; i < uniqueChars.length; i++) {
            for (int j = 0; j < inputCharSeq.length; j++) {
                if (uniqueChars[i] == inputCharSeq[j]){
                    charQuant[i]++;
                }
            }
        }
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.println(uniqueChars[i] + " " + charQuant[i]);
        }
        boolean needed = true;
        while (needed == true) {
            needed = false;
            for (int i = 0; i < charQuant.length-1; i++) {
                if (charQuant[i] < charQuant[i+1]){
                    needed = true;
                    int temp = charQuant[i];
                    charQuant[i] = charQuant [i+1];
                    charQuant[i+1] = temp;
                    Character tempCh = uniqueChars[i];
                    uniqueChars[i] = uniqueChars[i+1];
                    uniqueChars[i+1] = tempCh;
                }
            }
        }
        for (int i = 0; i < uniqueChars.length; i++) {
            System.out.println(uniqueChars[i] + " " + charQuant[i]);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");

    }
}
