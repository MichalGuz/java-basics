package roman_numerals;

import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    public static String toRoman(int number) {
        String[] rom = {"","I", "II","III","IV","V","VI","VII","VIII","IX","","X","XX","XXX","XL","L","LX", "LXX", "LXXX", "XC", "", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM","","M","MM","MMM"};
        List<String> roman = new ArrayList<>();

        for (String r: rom) {
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
        return result;
    }
}
