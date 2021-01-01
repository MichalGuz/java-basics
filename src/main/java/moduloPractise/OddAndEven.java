package moduloPractise;

public class OddAndEven {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printEven(int firstNumber, int lastNumber) {
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

    public static boolean isOdd(int number) {
        if ((number > 0) && (number % 2 != 0)) {
            return true;
        }
        return false;
    }

    public static void printOdd(int firstNumber, int lastNumber) {
        int counter = 0;
        if((firstNumber > 0) && (lastNumber > 0) && (firstNumber <= lastNumber)){
            for(int i = firstNumber; i < lastNumber; i++){
                if(isOdd(i) == true){
                    System.out.println("The odd number is: ");
                }
            }
        }
    }

    public static int sumOdd(int firstNumber, int lastNumber) {
        int sum = 0;
        if((firstNumber > 0) && (lastNumber >0) && (firstNumber <= lastNumber)) {
            for(int i=firstNumber; i<lastNumber; i++) {
                if(isOdd(i) == true) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}