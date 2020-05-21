package sum_digits_power;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SumDigitsPowerASCII {
    public static List<Long> sumDigPowASCII(long a, long b) {
        List<Long> nums = new ArrayList<Long>();
        for(long i = a; i<=b ; i++) {
            int y = 1;
            long sum = 0;
            IntStream hres = String.valueOf(i).chars().mapToObj(x -> (char) x).mapToInt(x -> x - '0');
        }        }
        return nums;
    }
}