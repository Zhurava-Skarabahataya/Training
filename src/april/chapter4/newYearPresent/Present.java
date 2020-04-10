package april.chapter4.newYearPresent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Present {

    private static Present present;
    List<Candy> candies = new ArrayList<>();
    Box presentBox;
    int totalWeight;

    private Present(){

    }

    static Present getPresent(){
        if (Present.present == null){
            Present.present = new Present();
        }
        return Present.present;
    }

    void makePresent(){
        getPresent();
        takeBox();
        fillThePresent();
    }

    void takeBox(){
        present.presentBox = new Box();
    }

    void fillThePresent(){
        Random random = new Random();
        while (Present.present.totalWeight < present.presentBox.getBOX_CAPACITY()){
            candies.add(Candy.createCandy(random.nextInt(4)));
        }
    }

}
