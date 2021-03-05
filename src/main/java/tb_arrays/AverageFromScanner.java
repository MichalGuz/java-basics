package tb_arrays;

import java.util.Scanner;

public class AverageFromScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static void printElementsAndAverage() {
    }

    public static int[] getNumbers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] numbers) {
        int sum = 0;
        for(int i=0; i<numbers.length; i++) {
        }
    }
}