package march.practice.chapter_1;

import java.util.Random;

class RandomNumberPrinter {

    int amount;
    Random randomNum = new Random();

    RandomNumberPrinter(int amount){
        this.amount = amount;
    }

    void printRandomNumbers(){
        for (int i = 0; i < amount; i++) {
            System.out.println(randomNum.nextInt(1000));
        }
    }
}
