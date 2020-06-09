package roman_numerals;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    public static String toRoman(int number) {
        if (number < 4000) {
            String[] rom = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "", "M", "MM", "MMM"};
            List<String> roman = new ArrayList<>();

            int numberOnlyForPrint = number;

            for (String r : rom) {
                roman.add(r);
                System.out.print(r + ", ");
            }

            List<Integer> numbers = new ArrayList<>();
            while (number > 0) {
                int digit = number % 10;
                numbers.add(digit);
                number /= 10;
            }

            String result = "";
            int temp = 0;
            for (Integer i : numbers) {
                i = i + temp;
                result = new StringBuilder().append(roman.get(i)).append(result).toString();
                temp += 10;
            }
            System.out.println("The roman numeral of " + numberOnlyForPrint + " = " + result);
            return result;
        } else {
            throw new IllegalArgumentException("Value of number must be less than 4000.");
        }
    }

    public static void main(String[] args) {
        toRoman(1234);
        toRoman(10);
        toRoman(101);
        toRoman(55);
        toRoman(1987);
        toRoman(3000);
        toRoman(999);
    }

}
