package is_square;

public class SquareVerifier {
    public static boolean isSquare(int p) {
        double n = Math.sqrt(p);
        if (p <= 0) {
            return false;
        } else if (p / n == n && p % n == 0) {
            return true;
        }
        return false;
    }
}
