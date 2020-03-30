package march.practice.StepickAlgorithms;

import java.util.*;

public class HuffmanCode1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        new HuffmanCode1().run();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");

    }

    private void run() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int chars = Integer.parseInt(sc.next());
        Map<String, Character> charInt = new HashMap<>();
        for (int i = 0; i < chars; i++) {
            String letter = sc.next();
            char c = letter.charAt(0);
            charInt.put(sc.next(), c);
        }
//        for (Map.Entry<String, Character> entry : charInt.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        String jjj = sc.next();
        StringBuilder sb = new StringBuilder(jjj);
        StringBuilder result = new StringBuilder();
        while (sb.length() > 0) {
            int count = 0;
            StringBuilder sss = new StringBuilder();
            while (true) {
                sss.append(sb.charAt(count));
                if (charInt.containsKey(sss.toString())){
                    result.append(charInt.get(sss.toString()));
                    sb.delete(0, count+1);
                    break;
                }
                count++;
            }
        }
        System.out.println(result);
    }
}
