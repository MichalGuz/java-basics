package squareDigitsCalculation;

public class SquareDigitsCalculation {
    private static int TEN  = 10;
    public int squareDigitsCalc(int n) {
        int result = 0;
        if (n < TEN) {
            result = n * n;
        }
        return result;
    }
}
