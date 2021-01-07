package moduloPractise;

public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid value - number can't be negative");
        } else {
            System.out.println(number + " = ");
            int digit = 0;
            int reversed = reverse(number);
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number /= 10;
        }
        return reversed;
    }
}
