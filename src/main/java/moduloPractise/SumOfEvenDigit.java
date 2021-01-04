package moduloPractise;

public class SumOfEvenDigit {
    public static int sumOfEvenDigit(int number) {
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
            System.out.println("Sum of even digits in number = " + sum);
            return sum;
        }
    }
}
