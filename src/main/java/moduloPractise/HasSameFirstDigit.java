package moduloPractise;

public class HasSameFirstDigit {
    public static boolean hasSameFirstDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if((isValid(firstNumber)!= true) || (isValid(secondNumber)!= true) || (isValid(thirdNumber)!= true)){
            System.out.println("has same first digit - false");
            return false;
        } else {
            int firstNumberfirstDigit = 0;
            int secondNumberfirstDigit = 0;
            int thirdNumberfirstDigit = 0;

            while ( firstNumber > 0) {
                firstNumberfirstDigit = firstNumber % 10;
                firstNumber /= 10;
            }

            while (secondNumber > 0) {
                secondNumberfirstDigit = secondNumber % 10;
                secondNumber /= 10;
            }

            while (thirdNumber > 0) {
                thirdNumberfirstDigit = thirdNumber % 10;
                thirdNumber /= 10;
            }

            if ((firstNumberfirstDigit == secondNumberfirstDigit) || (firstNumberfirstDigit == thirdNumberfirstDigit) || (secondNumberfirstDigit == thirdNumberfirstDigit)) {
                System.out.println("has same firts digit - true");
                return true;
            } else {
                System.out.println("has same first digit - false");
                return false;
            }
        }
    }

    public static boolean isValid ( int number){
        if ((number >= 10) && (number <= 1000)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        hasSameFirstDigit(112, 132, 14);
        hasSameFirstDigit(234, 23, 32);
        hasSameFirstDigit(3, 33, 333);
    }
}
