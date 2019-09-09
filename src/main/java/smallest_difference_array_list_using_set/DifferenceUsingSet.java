package smallest_difference_array_list_using_set;

import smallest_difference_array_list.ListCreator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DifferenceUsingSet {
    ListCreator creator = new ListCreator();
    ArrayList<Integer> ints = creator.fill();


    List<Integer> diffs = new ArrayList<>();

    int findSmallestDifference() {
        for (int i = 0; i < ints.size(); i++) {
            int temp = ints.get(i);
            for (int j = 0; j < ints.size(); j++) {
                int diff = temp - ints.get(j);
                if(diff >= 0) {
                    diffs.add(diff);
                }
            }
        }
        System.out.println("Unsorted collection of non-negative differences:\n" + diffs);
        Collections.sort(diffs);
        System.out.println("The sorted collection of non-negative differences:\n" + diffs);

        int foundSmallestDifference = diffs.get(0);
        System.out.println("The smallest non-negative difference is:" + foundSmallestDifference);
        return foundSmallestDifference;
    }
}
