package march.practice.StepickAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCode2 {

    class Node implements Comparable<Node>{
        final int sum;

        Node(int sum) {
            this.sum = sum;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(sum, o.sum);
        }
    }

    class InternalNode extends Node{
        Node left;
        Node right;

        public InternalNode(Node left, Node right) {
            super(left.sum + right.sum);
            this.left = left;
            this.right = right;
        }
    }

    class LeafNode extends  Node{
        char symb;

        public LeafNode(char symb, int count) {
            super(count);
            this.symb = symb;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        new HuffmanCode2().run();
        
        long fin = System.currentTimeMillis();
        System.out.println(fin-start + "ms");
    }

    private void run() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        System.out.println(inputStr);
        Map<Character, Integer> mapa = new HashMap<>();
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (mapa.containsKey(ch)){
                mapa.put(ch, mapa.get(ch) + 1);
            }
            else {
                mapa.put(ch, 1);
            }
        }
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();

    }
}
