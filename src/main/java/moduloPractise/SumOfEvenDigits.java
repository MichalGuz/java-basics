package moduloPractise;

public class SumOfEvenDigits {
    public static int sumOfEvenDigits(int number) {
        int theNumber = number;
        int sum = 0;
        int processedNumber = 0;
        if (number < 0) {
            System.out.println("It's a negative number");
            return -1;
        } else {
            while(number > 0) {
                processedNumber = number % 10;
                if (processedNumber % 2 == 0) {
                    sum += processedNumber;
                }
                number /= 10;
            }
            System.out.println("Sum of even digits in number " + theNumber + " = " + sum);
            return sum;
        }
    }

    public static void main(String[] args) {
        sumOfEvenDigits(124421);
        sumOfEvenDigits(202);
        sumOfEvenDigits(198);
        sumOfEvenDigits(-2222);
        sumOfEvenDigits(222222);
    }
}
