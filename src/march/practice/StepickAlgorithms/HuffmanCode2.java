package march.practice.StepickAlgorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCode2 {

    class Node implements Comparable<Node> {
        final int sum;
        String code;

        void buildCode(String code) {
            this.code = code;
        }

        Node(int sum) {
            this.sum = sum;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(sum, o.sum);
        }
    }

    class InternalNode extends Node {
        Node left;
        Node right;

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            left.buildCode(code + "0");
            right.buildCode(code + "1");
        }

        public InternalNode(Node left, Node right) {
            super(left.sum + right.sum);
            this.left = left;
            this.right = right;
        }
    }

    class LeafNode extends Node {
        char symb;

        @Override
        void buildCode(String code) {
            super.buildCode(code);
            System.out.println(symb + ": " + code);
        }

        public LeafNode(char symb, int count) {
            super(count);
            this.symb = symb;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        new HuffmanCode2().run();

        long fin = System.currentTimeMillis();
        System.out.println(fin - start + "ms");
    }

    private void run() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        //System.out.println(inputStr);
        Map<Character, Integer> mapa = new HashMap<>();
        for (int i = 0; i < inputStr.length(); i++) {
            char ch = inputStr.charAt(i);
            if (mapa.containsKey(ch)) {
                mapa.put(ch, mapa.get(ch) + 1);
            } else {
                mapa.put(ch, 1);
            }
        }
        Map<Character, Node> charMap = new HashMap<>();

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            LeafNode node = new LeafNode(entry.getKey(), entry.getValue());
            charMap.put(entry.getKey(), node);
            priorityQueue.add(node);
        }
        int sum = 0;
        while (priorityQueue.size() > 1) {
            Node first = priorityQueue.poll();
            Node second = priorityQueue.poll();
            InternalNode internalNode = new InternalNode(first, second);
            sum += internalNode.sum;
            priorityQueue.add(internalNode);
        }
        if (mapa.size() == 1) {
            sum = inputStr.length();
        }
        System.out.println(mapa.size() + " " + sum);
        Node root = priorityQueue.poll();
        if (mapa.size() == 1) {
            root.code = "0";
            System.out.println(inputStr.charAt(0) + ": " + root.code);
        } else {
            root.buildCode("");
        }
        String superCode = "";
        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            superCode += charMap.get(c).code;
        }
        System.out.println(superCode);
    }
}
