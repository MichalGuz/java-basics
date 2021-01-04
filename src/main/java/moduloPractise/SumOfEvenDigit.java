package moduloPractise;

public class SumOfEvenDigit {
    public static int sumOfEvenDigit(int number) {
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
        sumOfEvenDigit(124421);
        sumOfEvenDigit(202);
        sumOfEvenDigit(198);
        sumOfEvenDigit(-2222);
        sumOfEvenDigit(222222);
    }
}
