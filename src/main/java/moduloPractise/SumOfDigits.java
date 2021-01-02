package moduloPractise;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        int sum = 0;
        int digit;
        if(number >= 10) {
            while(number > 0) {
                digit = number % 10;
                sum += digit;
                number /= 10;
            }
            System.out.println("Sum = " + sum);
            return sum;
        } else {
            if (number >= 0) {
                System.out.println("Sum = " + number);
                return number;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        sumOfDigits(8);
        sumOfDigits(88);
        sumOfDigits(80880);
        sumOfDigits(0);
        sumOfDigits(-18);
    }
}


