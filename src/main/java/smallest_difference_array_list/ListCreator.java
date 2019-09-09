package smallest_difference_array_list;

import java.util.ArrayList;
import java.util.Random;

public class ListCreator {
    ArrayList<Integer> ints = new ArrayList<>();

    ArrayList<Integer> fill() {
        for(int i =0; i<5; i++){
            Random generator = new Random();
            int number = generator.nextInt(25);
            ints.add(number);
        }
        System.out.println("The 'ints' list contains:\n" + ints);
        return ints;
    }

}
