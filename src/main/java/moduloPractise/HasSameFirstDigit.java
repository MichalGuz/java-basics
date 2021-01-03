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
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
