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

    public List<Integer> getSecHigh(){
        return secHigh;
    }

    Integer found = secHigh.get(secHigh.size() - 2);
}
