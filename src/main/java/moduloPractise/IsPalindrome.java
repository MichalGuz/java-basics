package moduloPractise;

public class IsPalindrome {
    public static boolean isPalindrom(int number) {
        int temp = number;
        int reversed = 0;
        if(number < 0) {
            System.out.println("False: " + number + " is a negative number.");
            return false;
        } else {
            while (temp > 0) {
                int mod = temp % 10;
                reversed = (reversed * 10) + mod;
                temp /= 10;
            }
            return false;
        }
    }
}
