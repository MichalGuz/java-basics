package squareDigitsTypesConversion;

public class SquareDigitsTypesConversion {
    public int squareDigitsWithTypesConversion(int n){
        System.out.println("Number to square its digits: " + n);
        String number = String.valueOf(n);
        String[] arrayOfDigits = number.split("");
        for(String a: arrayOfDigits){
            System.out.println(a);
        }
        int temporary = arrayOfDigits.length;
        return temporary;
    }
}
