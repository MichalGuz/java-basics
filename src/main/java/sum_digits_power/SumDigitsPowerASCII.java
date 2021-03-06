package sum_digits_power;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SumDigitsPowerASCII {
    public static List<Long> sumDigPowASCII(long a, long b) {
        if ((a < 1) || (b < 1)) {
            System.out.println("numbers must be non-zero positive integers");
            throw new IllegalArgumentException();
        }
        List<Long> nums = new ArrayList<Long>();
        for(long i = a; i<=b ; i++) {
            int y = 1;
            long sum = 0;
            // using ASCII char value in calculation: '0' = 48, '1' = 49, '2' = 50 etc;
            IntStream hres = String.valueOf(i).chars().mapToObj(x -> (char) x).mapToInt(x -> x - '0');

            for(double j : hres.toArray()) {
                sum += Math.pow(j,y); y++;
            }

            if (sum == i) {
                nums.add(i);
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        sumDigPowASCII(5L,90L).stream().map(x -> x.toString() + ", ").forEach(System.out::print);
    }
}