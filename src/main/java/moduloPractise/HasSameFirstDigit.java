package moduloPractise;

public class HasSameFirstDigit {
    public static boolean hasSameFirstDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if((isValid(firstNumber)!= true) || (isValid(secondNumber)!= true) || (isValid(thirdNumber)!= true)){
            System.out.println("has same last digit - false");
            return false;
        } else {
            int firstNumberLastDigit = firstNumber % 10;
            int secondNumberLastDigit = secondNumber % 10;
            int thirdNumberLastDigit = thirdNumber % 10;

        }
        return false;
    }

    public static boolean isValid ( int number){
        if ((number >= 10) && (number <= 1000)) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
