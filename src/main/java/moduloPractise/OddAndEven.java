package moduloPractise;

public class OddAndEven {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void evenPrint(int firstNumber, int lastNumber) {
        int counter = 0;
        while (firstNumber <= lastNumber && counter < 6) {
            firstNumber++;
            if (!isEven(firstNumber)) {
                continue;
            }
            System.out.println("The even number is: " + firstNumber);
            counter++;
        }
    }

    public static int sumEven(int firstNumber, int lastNumber) {
        int sum = 0;
        int counter = 0;
        while(firstNumber <= lastNumber && counter < 6) {
            if(!isEven((firstNumber))) {
                continue;
            }
            sum += firstNumber;
            counter++;
        }
        System.out.println("Sum of even numbers = " + sum);
        return sum;
    }
}