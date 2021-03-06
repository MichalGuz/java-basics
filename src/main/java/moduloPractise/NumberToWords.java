package moduloPractise;

public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid value - number can't be negative");
        } else {
            System.out.print(number + " = ");
            int digit = 0;
            int reversed = reverse(number);
            int numberOfDigits = countDigits(number);

            int difference = countDigits(number) - countDigits(reversed);

            for (int i = 0; i < numberOfDigits; i++) {
                digit = reversed % 10;

                switch (digit) {
                    case 0:
                        System.out.print("Zero");
                        break;
                    case 1:
                        System.out.print("One");
                        break;
                    case 2:
                        System.out.print("Two");
                        break;
                    case 3:
                        System.out.print("Three");
                        break;
                    case 4:
                        System.out.print("Four");
                        break;
                    case 5:
                        System.out.print("Five");
                        break;
                    case 6:
                        System.out.print("Six");
                        break;
                    case 7:
                        System.out.print("Seven");
                        break;
                    case 8:
                        System.out.print("Eight");
                        break;
                    case 9:
                        System.out.print("Nine");
                        break;
                }
                reversed /= 10;
                System.out.print(" ");
            }

            if(difference > 0) {
                for(int i = 0; i<difference; i++) {
                    System.out.println("Zero ");
                }
            }

            System.out.println("");
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

    public static void main(String[] args) {
        numberToWords(0);
        numberToWords(100);
        numberToWords(1234);
        numberToWords(2005);
        numberToWords(987);
        numberToWords(333);
    }
}
