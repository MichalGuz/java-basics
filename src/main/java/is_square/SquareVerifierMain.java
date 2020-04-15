package is_square;

import java.util.Arrays;

import static is_square.SquareVerifierNegative.isSquare;
import static is_square.SquareVerifierPositive.isSquareP;

public class SquareVerifierMain {
    public static void main(String[] args) {
        int[] numbers = new int[122];
        for (int i = 0; i < numbers.length; i++) {
            Arrays.fill(numbers, i, i + 1, i);
        }

//        for (int n : numbers) {
//            System.out.print("For a number: " + n + " the statement \"this number is square\" = ");
//            boolean check = isSquare(n);
//            System.out.println(check + ";");
//        }

        for (int n :numbers) {
            System.out.print("For a number: " + n + " the statement \"this number is square\" = ");
            boolean check = isSquareP(n);
            System.out.println(check + ";");
        }

    }
}
