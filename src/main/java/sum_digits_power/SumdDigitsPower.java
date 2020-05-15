package sum_digits_power;

import java.util.ArrayList;
import java.util.List;

public class SumdDigitsPower {
    public static Long[] sumDigitsPower(Long a, Long b) {
        List<Long> inputNums = new ArrayList<>();
        List<Long> outputInts = new ArrayList<>();
        List<Long>  powered = new ArrayList<>();
        Long[] inputArray = new Long[inputNums.size()];
        Long[] output = new Long[outputInts.size()];
        Long[] poweredInts = new Long[powered.size()];

        for (long i = a; i < b+1; i++) {
            inputNums.add(i);
        }
        for (Long x: inputNums) {
            if (x < 10 && x > 0) {
                powered.add(x);
            } else {
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
        }
        for (int y = 0; y < inputNums.size(); y++) {
            if (inputNums.get(y).equals(powered.get(y))) {
                Long q = inputNums.get(y);
                outputInts.add(q);
            }

        }
        return output;
    }
}
