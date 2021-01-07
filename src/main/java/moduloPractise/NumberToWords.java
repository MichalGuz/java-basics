package moduloPractise;

public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid value - number can't be negative");
        } else {
            System.out.println(number + " = ");
            int digit = 0;
            int reversed = reverse(number);
            int numberOfDigits = countDigits(number);

            for (int i = 0; i < numberOfDigits; i++) {
            }
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

    private static int countDigits(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            int counter = 0;
            while (number > 0) {
                counter++;
                number /= 10;
            }
            return counter;
        }
    }
}
