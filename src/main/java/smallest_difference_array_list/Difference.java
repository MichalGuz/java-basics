package smallest_difference_array_list;

import java.util.ArrayList;
import java.util.Collections;
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
        for(int i = 0; i<ints.size(); i++){
            int temp = ints.get(i);
            for(int j = 0; j<ints.size(); j++){
                int diff = temp - ints.get(j);
                diffs.add(diff);
            }
        }
        System.out.println("Unsorted collection of differences:\n" + diffs);
        Collections.sort(diffs);
        System.out.println("The sorted collection of difference:\n" + diffs);
        int foundSmallestDifference;
        return foundSmallestDifference;
    }
}
