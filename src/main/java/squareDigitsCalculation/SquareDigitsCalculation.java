package squareDigitsCalculation;

public class SquareDigitsCalculation {
    private static int TEN  = 10;
    public static int squareDigitsCalc(int n) {
        if (n < TEN) {
            return n * n;
        }

        int digit = n % TEN;
        System.out.println("digit = " + digit);

        int squaredDigit = digit * digit;
        System.out.println("squaredDigit = " + squaredDigit);

        int a = (squaredDigit < TEN ? TEN : TEN * TEN);
        System.out.println("a = " + a);

        int b = squareDigitsCalc(n / TEN);
        System.out.println("b = " + b);

        int result = squaredDigit + a * b;
        System.out.println("result of squareDigitsCalc() = " + result);

        return result;
    }
}
