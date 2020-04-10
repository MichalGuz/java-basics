package squareDigitsCalculation;

import static squareDigitsCalculation.SquareDigitsCalculation.squareDigitsCalc;
import static squareDigitsCalculation.SquareDigitsCalculationConcise.squareDigitsCalcConcisely;

public class SquareDigitsCalcMain {
    public static void main(String[] args) {
        int firstSquaredDigits = squareDigitsCalc(12345);
        int secondSquaredDigits = squareDigitsCalcConcisely(2035602);
    }
}
