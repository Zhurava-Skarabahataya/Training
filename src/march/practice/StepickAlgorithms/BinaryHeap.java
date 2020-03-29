package march.practice.StepickAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BinaryHeap {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        new BinaryHeap().run();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start + "ms");

    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        //ArrayList <Long> lonArr = new ArrayList<>();
        int operations = sc.nextInt();
        PriorityQueue <Long> priorityQueue = new PriorityQueue<>(operations, Collections.reverseOrder());
        for (int i = 0; i < operations; i++) {
            String command = sc.next();
            switch (command){
                case "Insert" :{
                    long number = Long.parseLong(sc.next());
                    priorityQueue.add(number);
                    //lonArr.add(number);
                    break;
                }
                case "ExtractMax":{
                    //long max = Collections.max(lonArr);
                    System.out.println(priorityQueue.poll());
                   // lonArr.remove(max);
                    break;
                }
            }
        }

    }


}
