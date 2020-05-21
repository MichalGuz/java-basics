package sum_digits_power;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDigitsPower {
    public static Long[] sumDigitsPower(Long a, Long b) {
        List<Long> inputNums = new ArrayList<>();
        List<Long> outputInts = new ArrayList<>();
        List<Long> powered = new ArrayList<>();
        Long[] inputArray = new Long[inputNums.size()];
        Long[] output = new Long[outputInts.size()];
        Long[] poweredInts = new Long[powered.size()];

        for (long i = a; i < b + 1; i++) {
            inputNums.add(i);
        }
        for (Long x : inputNums) {
            long temp = 0;
            double poweredTemp = 0;
            long sum = 0;
            do {
                temp = x % 10;
                poweredTemp = Math.pow(temp, x.toString().length());
                sum += poweredTemp;
                x /= 10;
            } while (x >= 1);
            powered.add(sum);
        }
        for (int y = 0; y < inputNums.size(); y++) {
            if (inputNums.get(y).equals(powered.get(y)) && inputNums.get(y) != 0) {
                Long q = inputNums.get(y);
                outputInts.add(q);
            }

        }
        System.out.println("inputArray = " + Arrays.toString(inputNums.toArray(inputArray)));
        System.out.println("powered ArrayList = " + Arrays.toString(powered.toArray(poweredInts)));
        System.out.println("outputInts ArrayList = " + Arrays.toString(outputInts.toArray(output)));

        return output;
    }

    public static void main(String[] args) {
        sumDigitsPower(-1L, 135L);
    }
}
