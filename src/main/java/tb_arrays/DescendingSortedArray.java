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
        for (int i = 0; i < array.length; i++) {
            for (int p = 0; p < array.length; p++) {
                if (array[i] > array[p]) {
                    int temp = array[p];
                    array[p] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int m = 0; m < array.length; m++) {
            System.out.print(array[m] + ", ");
        }
    }

    public static void printNumbers(int capacity) {
        int[] array = getNumbers(capacity);
        System.out.print("Array of typed elements = ");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("Array of sorted elements in descending order = ");
        descendingSortOfArray(array);
    }
}
