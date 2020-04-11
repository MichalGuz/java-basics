 package squareDigitsCalculation;

public class SquareDigitsCalculationWhileLoop {
    public static int squareDigitsCalcWhileLoop(int n) {
        String result = "";
        while (n != 0) {
            System.out.println("Start a new run of the loop: n = " + n);

            int digit = n % 10;
            System.out.println("Loop is running: digit = " + digit);

            result = digit * digit + result;
            System.out.println("Loop is still running: result = " + result);

            n /= 10;
            System.out.println("Last calculation in a single run of loop: n = " + n);
        }

        Integer squaredDigits = Integer.parseInt(result);
        System.out.println("result of squareDigitsCalcWhileLoop() method = " + squaredDigits);

        return squaredDigits;
    }
}
