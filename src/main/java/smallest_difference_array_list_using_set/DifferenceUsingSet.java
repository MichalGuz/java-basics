package smallest_difference_array_list_using_set;
import smallest_difference_array_list.ListCreator;

import java.util.*;
import java.util.stream.Collectors;

public class DifferenceUsingSet {
    ListCreator creator = new ListCreator();
    ArrayList<Integer> ints = creator.fill();

    Set<Integer> diffs = new HashSet<>();

    void findSmallestDifference() {
        System.out.println(ints.size());
        for (int i = 0; i < ints.size(); i++) {
            int temp = ints.get(i);
            for (int j = 0; j < ints.size(); j++) {
                int diff = temp - ints.get(j);
                if(diff >= 0) {
                    diffs.add(diff);
                }
            }
        }
        System.out.println("Size of set is: " + diffs.size());
        List<Integer> sortedDiffs = diffs.stream()
                .sorted()
                .collect(Collectors.toList());


    }
}
