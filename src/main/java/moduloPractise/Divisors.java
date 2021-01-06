package moduloPractise;

public class Divisors {
    public static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
        int divisor = 1;
        int theGreatestDivisor = 0;

        if(firstNumber < 0 || secondNumber < 0) {
            System.out.println("Invalid values - numbers must be positive");
            return -1;
        }

        if (firstNumber >= secondNumber) {
            while (divisor <= secondNumber) {
                if((firstNumber % divisor == 0) && (secondNumber % divisor == 0)) {
                    theGreatestDivisor = divisor;
                }
                divisor++;
            }
        }

        return theGreatestDivisor;
    }
}
