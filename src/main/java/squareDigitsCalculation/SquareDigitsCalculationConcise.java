package squareDigitsCalculation;

public class SquareDigitsCalculationConcise {
    private static int TEN = 10;
    public static int squareDigitsCalcConcisely(int n) {
        if (n < TEN) {
            return n * n;
        }

        int digit = n % TEN;

        int squaredDigit = digit * digit;
    }
}
