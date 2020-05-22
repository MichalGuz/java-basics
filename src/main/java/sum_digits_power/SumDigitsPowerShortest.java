package sum_digits_power;

import java.util.ArrayList;
import java.util.List;

public class SumDigitsPowerShortest {
    public static List<Long> sumDigitsPowerShortest( long a, long b){
    }

    private static List<Long> calculate(long a, long b) {
        List<Long> numbers = new ArrayList<>();
        for (long i = a; i < b; i++) {
            if(isEqualToPowered(i)) {
                numbers.add(i);
            }
        }
    }

    private static boolean isEqualToPowered(long x) {
        String value = String.valueOf(x);
        long sum= 0;
        for (int i = 0; i < value.length(); i++) {
            long digit = Long.parseLong(String.valueOf(value.charAt(i)));
            sum+= Math.pow(digit, i + 1);
        }
        return sum == x;
    }
}
