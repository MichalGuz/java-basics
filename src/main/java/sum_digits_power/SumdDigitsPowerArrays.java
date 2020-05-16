package sum_digits_power;

import java.util.List;

import static java.util.Arrays.fill;

public class SumdDigitsPowerArrays {
    public static List<Long> sumDigitsPower(long a, long b) {
        long[] inputArray = new long[(int)((b-a)+1L)];
        long[] output = new long[(int)((b-a)+1L)];
        long[] poweredInts = new long[(int)((b-a)+1L)];;

        int index1 = 0;
        for (long i = a; i < b + 1; i++) {
            fill(inputArray, index1, index1+1, i);
        }
    }
}