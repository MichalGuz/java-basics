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
        } else {
            while (divisor <= firstNumber) {
                if ((firstNumber % divisor == 0) && (secondNumber % divisor == 0)) {
                    theGreatestDivisor = divisor;
                }
                divisor++;
            }
        }
        System.out.println("The greatest common divisor of number " + firstNumber + " and number " + secondNumber + " is " + theGreatestDivisor);
        return theGreatestDivisor;
    }

    public static void printAllFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid value");
        } else {
            int dividor = 1;
            do {
                if (number % dividor == 0) {
                    System.out.println(dividor);
                }
                dividor++;
            } while (dividor <= number);
        }
    }

    public static void main(String[] args) {
        findGreatestCommonDivisor(24, 60);
        findGreatestCommonDivisor(-80, 8);
        findGreatestCommonDivisor(88, 320);
        findGreatestCommonDivisor(17, 144);
        findGreatestCommonDivisor(17, 289);

        printAllFactors(44);
        printAllFactors(0);
    }
}
