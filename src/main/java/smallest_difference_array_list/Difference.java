package smallest_difference_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Difference {
    ListCreator creator = new ListCreator();
    ArrayList<Integer> ints = creator.fill();


    List<Integer> diffs = new ArrayList<>();

    int findSmallestDifference() {
        for (int i = 0; i < ints.size(); i++) {
            int temp = ints.get(i);
            for (int j = 0; j < ints.size(); j++) {
                int diff = temp - ints.get(j);
                diffs.add(diff);
            }
        }
        System.out.println("Unsorted collection of differences:\n" + diffs);
        Collections.sort(diffs);
        System.out.println("The sorted collection of difference:\n" + diffs);

        int foundSmallestDifference = diffs.get(0);
        System.out.println("The smallest difference is:" + foundSmallestDifference);
        return foundSmallestDifference;
    }

    public static void main(String[] args) {
        Difference d = new Difference();

        d.findSmallestDifference();
    }
}