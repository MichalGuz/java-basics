package tb_arrays;

import java.util.Scanner;

public class DescendingSortedArray {
    private static Scanner scanner = new Scanner(System.in);

    public static int[] getNumbers(int capacity) {
        int[] numbers = new int[capacity];
        System.out.println("Enter " + capacity + " integers values:");
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void descendingSortOfArray(int[] array) {
    }
}
