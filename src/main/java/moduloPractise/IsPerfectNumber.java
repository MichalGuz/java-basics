package moduloPractise;

// perfect number is when the sum of all it's factors equals value of this number
public class IsPerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            System.out.println("Invalid value.");
            return false;
        } else {
            int factor = 1;
            int sum = 0;
            while (factor < number) {
                if(number % factor == 0){
                    sum += factor;
                }
                factor++;
            }
            if(sum == number) {
                System.out.println("True: " + number + " is a perfect number");
                return true;
            } else {
                System.out.println("False: " + number + " is not a perfect number");
                return false;
            }
        }
    }

    public static void main(String[] args) {
        isPerfectNumber(6);
        isPerfectNumber(-1);
        isPerfectNumber(5);
        isPerfectNumber(28);
        isPerfectNumber(33550336);
    }
}
