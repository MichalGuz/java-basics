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
        for (long i = a; i < b; i++) {
            if(isEqual(i)) {
                comparedNumbers.add(i);
            }
        }
        return  comparedNumbers;
    }

    private static boolean isEqual(long number){
        long temp = number;
        long sum = 0;
        int power = lenght(number);
        while (temp > 0) {
            sum += (long) Math.pow(temp % 10, power);
            temp /= 10;
            power--;
        }
        return sum == number;
    }

    private static int lenght(long n) {
        int length = 0;
        while (n > 0) {
            n /= 10;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        sumDigitsPowerShorter(88L, 230L).stream().map(i -> i.toString()).forEach(System.out::println);
    }
}
