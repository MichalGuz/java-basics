package is_square;

public class SquareVerifierPositive {
    public static boolean isSquareP(int n) {
        if (n < 0 || Math.sqrt(n) % 1 != 0 ) {
            return false;
        }
        return true;
    }
}
