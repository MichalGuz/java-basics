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

    public static int sumEven(int firstNumber, int lastNumber){
        int sum = 0;
        return sum;
    }
}