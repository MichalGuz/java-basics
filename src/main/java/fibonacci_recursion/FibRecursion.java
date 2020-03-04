package fibonacci_recursion;

public class FibRecursion {
    public static int findFibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return findFibonacciNumber(n - 1) + findFibonacciNumber((n));
        }
    }
}
