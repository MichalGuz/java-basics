package dividable_by_3_or_5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DividableByThreeOrFive {
//   Instructions:
//   If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//   Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//   Note: If the number is a multiple of both 3 and 5, only count it once.

    public static List<Integer> dividableNumbersFromRange(int a, int b) {
        if ((a < 1) || b < 0) {
            System.out.println("All numbers must be non-zero, positive integer.");
            throw new IllegalArgumentException();
        } else {
            List<Integer> numbers = new ArrayList<>();
            numbers = IntStream.rangeClosed(a, b)
                    .filter(i -> ((i % 3) == 0) || ((i % 5) == 0))
                    .boxed()
                    .collect(Collectors.toList());
            return numbers;
        }
    }

    public static int sumDividableNumbersFromRange(List<Integer> numbers) {
        int n = 0;
        return n = numbers.stream().mapToInt(i -> i).sum();
    }

    public static int sumDividableNumbersBelow(int number) {
        if (number < 1) {
            System.out.println("All numbers must be non-zero, positive integer.");
            throw new IllegalArgumentException();
        } else {
            return IntStream.range(0, number).filter(i -> ((i % 3) == 0) || ((i % 5) == 0)).sum();
        }
    }

    public static int sumDividableNumbersBelowWithLoop(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++ ){

        }

    }
}

