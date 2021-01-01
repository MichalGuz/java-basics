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
        while ((firstNumber <= lastNumber) && (counter <= (lastNumber - firstNumber))) {
            if (!isEven(firstNumber)) {
                firstNumber++;
                continue;
            }
            System.out.println("The even number is: " + firstNumber);
            firstNumber++;
            counter++;
        }
    }

    public static int sumEven(int firstNumber, int lastNumber) {
        int sum = 0;
        int counter = 0;
        while((firstNumber <= lastNumber) && (counter <= (lastNumber - firstNumber))) {
            if(!isEven((firstNumber))) {
                firstNumber++;
                continue;
            }
            sum += firstNumber;
            firstNumber++;
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
            for(int i = firstNumber; i <= lastNumber; i++){
                if(isOdd(i) == true){
                    System.out.println("The odd number is: "+ i);
                }
            }
        }
    }

    public static int sumOdd(int firstNumber, int lastNumber) {
        int sum = 0;
        if((firstNumber > 0) && (lastNumber >0) && (firstNumber <= lastNumber)) {
            for(int i = firstNumber; i <= lastNumber; i++) {
                if(isOdd(i) == true) {
                    sum += i;
                }
            }
        }
        System.out.println("Sum of odd numbers = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        isEven(24);
        printEven(20,26);
        sumEven(20,26);

        isOdd(13);
        printOdd(9,13);
        sumOdd(9,13);
    }
}