package moduloPractise;

public class IsPalindrome {
    public static boolean isPalindrom(int number) {
        int temp = number;
        int reversed = 0;
        if (number < 10 ) {
            System.out.println("False: " + number + " is less than 10.");
            return false;
        } else {
            while (temp > 0) {
                int mod = temp % 10;
                reversed = (reversed * 10) + mod;
                temp /= 10;
            }
            if (reversed == number) {
                System.out.println("True - " + reversed + " is a palindrome of " + number);
                return true;
            } else {
                System.out.println("False - " + reversed + " is not a palindrome of " + number);
                return false;
            }
        }
    }

    public static void main(String[] args) {
        isPalindrom(303);
        isPalindrom(5439345);
        isPalindrom(111);
        isPalindrom(6985);
        isPalindrom(316913);
        isPalindrom(0);
    }
}