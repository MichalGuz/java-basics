package fibonacci_recursion;

import java.util.Scanner;

public class FibRecursion {
    public static int findFibonacciNumber(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return findFibonacciNumber(n - 1) + findFibonacciNumber((n));
        }
    }

    public static void main(String[] args) {
        System.out.println("Which number from Fibonacci sequence do you want to see?");
        Scanner input = new Scanner(System.in);
    }
}
