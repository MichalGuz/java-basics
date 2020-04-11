 package squareDigitsCalculation;

public class SquareDigitsCalculationWhileLoop {
    public int squareDigitCalcWhileLoop(int n) {
        String result = "";
        while (n != 0) {
            System.out.println("Start the loop: n = " + n);

            int digit = n % 10;
            System.out.println("Loop is running: digit = " + digit);

            result = digit * digit + result;
            System.out.println("Loop is still running: result = " + result);

            n /= 10;

        }
    }
}
