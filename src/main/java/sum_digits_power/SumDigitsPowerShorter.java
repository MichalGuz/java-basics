package sum_digits_power;

import java.util.List;

public class SumDigitsPowerShorter {
    public static List<Long> sumDigitsPowerShorter(Long a, Long b) {
        if ((a < 1) || (b < 1)) {
            System.out.println("numbers must be non-zero positive integers");
            throw new IllegalArgumentException();
        }
    }
}
