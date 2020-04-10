package squareDigitsCalculation;

public class SquareDigitsCalculation {
    private static int TEN  = 10;
    public int squareDigitsCalc(int n) {
        int result = 0;

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

        result = squaredDigit + a * b;
        System.out.println("result = " + result);

        return result;
    }
}
