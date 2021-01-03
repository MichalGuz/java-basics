package moduloPractise;

public class HasSharedDigits {
    public static boolean hasSharedDigits(int firstNumber, int secondNumber) {
        int f = firstNumber;
        int s = secondNumber;
        if ((firstNumber < 10) || (firstNumber > 99 ) || (secondNumber < 10) || (secondNumber > 99)) {
            System.out.println("false");
            return false;
        } else {
            int digitOne = firstNumber % 10;
            int digitTwo = (firstNumber / 10) % 10;
            int digitTree = secondNumber % 10;
            int digitFour = (secondNumber / 10) % 10;
        }
        return false;
    }
}
