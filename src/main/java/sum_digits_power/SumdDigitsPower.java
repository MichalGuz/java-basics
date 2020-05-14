package sum_digits_power;

import java.util.ArrayList;
import java.util.List;

public class SumdDigitsPower {
    public static Long[] sumDigitsPower(Long a, Long b) {
        List<Long> inputNums = new ArrayList<>();
        List<Long> outputInts = new ArrayList<>();
        Long[] inputArray = new Long[inputNums.size()];
        Long[] output = new Long[outputInts.size()];
        for (long i = a; i < b+1; i++) {
            inputNums.add(i);
        }
        for (Long x: inputNums) {
            if (x < 10 && x > 0) {

            }
        }
        return output;
    }
}
