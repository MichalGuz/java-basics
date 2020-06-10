package roman_numerals;

public class RomanNumeralsUnique {
    private static final int[] arab = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static final String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    public static String toRomanNumeral(int n) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (n > 0) {
            if (n >= arab[i++]) {
                result.append(roman[i--]);
            }
        }
    }
}
