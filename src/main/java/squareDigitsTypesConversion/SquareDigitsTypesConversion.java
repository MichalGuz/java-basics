package squareDigitsTypesConversion;

public class SquareDigitsTypesConversion {
    public int squareDigitsWithTypesConversion(int n) {
        System.out.println("Number to square its digits: " + n);

        String number = String.valueOf(n);

        String[] arrayOfDigits = number.split("");

        System.out.println("Array of digits contains: ");
        for (String a : arrayOfDigits) {
            System.out.print(a);
        }

        String joined = "";

        for (String b : arrayOfDigits) {
            int digit = Integer.parseInt(b);
            int squaredDigit = digit * digit;

        }
            int temporary = arrayOfDigits.length;
            return temporary;
    }
}
