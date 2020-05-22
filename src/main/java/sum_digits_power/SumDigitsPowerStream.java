package sum_digits_power;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumDigitsPowerStream {
    public static List<Long> sumDigitsPowerStream(long a, long b) {
        return LongStream.rangeClosed(a,b)
                .filter(i -> isEqualToPower(i))
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isEqualToPower(long number) {
        String value = Long.toString(number);
        return IntStream.range(0,value.length())
                .mapToDouble(x -> Math.pow(Character.getNumericValue(value.charAt(x)), x + 1))
                .sum() == number;
    }

    public static void main(String[] args) {
        sumDigitsPowerStream(9L,90L).stream().map(n -> n.toString()).forEach(System.out::print);
    }
}
