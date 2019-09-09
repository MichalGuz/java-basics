package smallest_difference_array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Difference {
    ArrayList<Integer> ints = new ArrayList<>();

    ArrayList<Integer> fill() {
        for(int i =0; i<5; i++){
            Random generator = new Random();
            int number = generator.nextInt(5);
            ints.add(number);
        }
        return ints;
    }

    void checkArrayList() {
        for (Integer index : ints) {
            System.out.println(index);
        }
        System.out.println("The size of ints list is: " + ints.size());
    }

    List<Integer> diffs = new ArrayList<>();

    int findSmallestDifference(){
        int foundSmallestDifference;
        return foundSmallestDifference;
    }
}
