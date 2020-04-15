package is_square;

public class SquareVerifierNegative {
    public static boolean isSquare(int p) {
        double n = Math.sqrt(p);
        if (p < 0) {
            return false;
        } else if (p == 0 || p % n == 0) {
            return true;
        }
        return false;
    }
}
