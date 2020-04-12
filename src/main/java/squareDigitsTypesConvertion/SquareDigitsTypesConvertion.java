package squareDigitsTypesConvertion;

public class SquareDigitsTypesConvertion {
    public int squareDigitsWithTypesConvertion( int n){
        System.out.println("Number to square its digits: " + n);
        String number = String.valueOf(n);
        String[] arrayOfDigits = number.split("");
        System.out.println(arrayOfDigits);
        int temporary = arrayOfDigits.length;
        return temporary;
    }
}
