package moduloPractise;

public class HasSameLastDigit {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (isValidNumber(firstNumber) && isValidNumber(secondNumber) && isValidNumber(thirdNumber)) {
            int firstLastDigit = firstNumber % 10;
            int secondLastDigit = secondNumber% 10;
            int thirdLastDigit = thirdNumber% 10;
            if(firstLastDigit == secondLastDigit && secondLastDigit == thirdLastDigit) {
                System.out.println("The" + firstLastDigit + " the same last digit in numbers: " + firstLastDigit + ", " + secondLastDigit + ", " + thirdLastDigit);
                return true;
            } else {
                System.out.println("False");
                return false;
            }
        } else {
            System.out.println("Inappropriate numbers");
            return false;
        }
    }

    public static boolean isValidNumber(int number) {
        if(number >= 10 && number <=1000) {
            return true;
        } else {
            return false;
        }
    }
}
