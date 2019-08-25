package first_attempt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {
    int[] nbs = {23, 43, 34, 65,45,55,43,57,53,43, 35, 59, 60, 63,72,21,31,33,53};

    List<Integer> secHigh = Arrays.stream(nbs)
            .mapToObj(o -> o)
            .collect(Collectors.toSet()).stream()
            .sorted()
            .collect(Collectors.toList());

    public List<Integer> getListSecHigh(){
        return secHigh;
    }

    public Integer getSecHighNumber(){
        return secHigh.get(secHigh.size() - 2);
    }

    public static void main(String[] args) {
        SecondHighest s = new SecondHighest();
        System.out.println(s.getListSecHigh() + "\nThe size of list is: " + s.getListSecHigh().size());
        System.out.println("The second highest number in array 'nbs' is: " + s.getSecHighNumber());
    }
}
