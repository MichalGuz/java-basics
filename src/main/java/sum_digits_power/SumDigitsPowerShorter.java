package sum_digits_power;

import java.util.ArrayList;
import java.util.List;

public class SumDigitsPowerShorter {
    public static List<Long> sumDigitsPowerShorter(long a, long b) {
        if ((a < 1) || (b < 1)) {
            System.out.println("numbers must be non-zero positive integers");
            throw new IllegalArgumentException();
        }

        List<Long> comparedNumbers = new ArrayList<>();
        return  comparedNumbers;
    }

    private static boolean isEqual(long number){
        long temp = 0;
        long sum = 0;
        int power = lenght(number);

        }
    }

    private static int lenght(long n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }

}
