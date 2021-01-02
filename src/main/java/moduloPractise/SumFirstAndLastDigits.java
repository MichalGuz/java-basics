package moduloPractise;

public class SumFirstAndLastDigits {
    public static int sumFirstAndLastDigits(int number) {
        int processedNumber = number;
        int sum = 0;
        if (processedNumber < 0) {
            System.out.println("It is a negative number");
            return -1;
        } else {
            if (processedNumber < 10) {
                System.out.println("The first and last digits is " + processedNumber + " because the number: " + processedNumber +  " is a single digit number.");
                sum = processedNumber;
            } else {
                int firstDigit = 0;
                int lastDigit = processedNumber % 10;
                do {
                    firstDigit = processedNumber % 10;
                    processedNumber /= 10;
                } while (processedNumber > 0);
                sum = firstDigit + lastDigit;
                System.out.println("First digit of number " + number + " is " + firstDigit);
                System.out.println("Last digit of number " + number + " is " + lastDigit);
            }
        }
        System.out.println("Sum of first and last digits is " + sum);
        return sum;
    }

    public static void main(String[] args) {
        sumFirstAndLastDigits(0);
        sumFirstAndLastDigits(7);
        sumFirstAndLastDigits(17);
        sumFirstAndLastDigits(303);
        sumFirstAndLastDigits(-4321);
        sumFirstAndLastDigits(1200);
    }
}

