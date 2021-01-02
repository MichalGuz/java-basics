package moduloPractise;

public class SumFirstAndLastDigits {
    public static int sumFirstAndLastDigits(int number) {
        int processedNumber = number;
        int sum = 0;
        if (processedNumber < 0) {
            System.out.println("It is a negative number");
            return -1;
        } else {
            int firstDigit = 0;
            int lastDigit = processedNumber % 10;
            do {
                firstDigit = processedNumber % 10;
                processedNumber /= 10;
            } while (processedNumber > 0);
        }
    return sum;
    }

}

