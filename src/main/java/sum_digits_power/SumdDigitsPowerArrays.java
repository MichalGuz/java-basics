package sum_digits_power;

import java.util.ArrayList;
import java.util.Arrays;
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
            System.out.println("i = " + i);
            System.out.println("inputArray = " + Arrays.toString(inputArray));
            index1++;
        }

        int index2 = 0;
        for (long x : inputArray) {
            long temp = 0;
            double poweredTemp = 0;
            long sum = 0;
            String tempStr = "";
            do {
                tempStr = Integer.toString((int) x);

            } while (x >=0);
        }

            List<Long> list = new ArrayList<>();
        return list;
    }
}