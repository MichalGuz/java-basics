package tb_arrays;

import java.util.Scanner;

public class DescendingSortedArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void processDescendingSortedArray() {
        int capacity = 0;
        System.out.println("Enter an integer: ");
        capacity = scanner.nextInt();
        System.out.println("Enter " + capacity + " integers values:");
        int[] array = getNumbers(capacity);
        printNumbers(array);
    }

    public static int[] getNumbers(int capacity) {
       int[] numbers = new int[capacity];
       for(int i=0; i<numbers.length; i++){
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

    public static void printNumbers(int[] array) {
        System.out.print("Array of typed elements = ");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("Array of sorted elements in descending order = ");
        descendingSortOfArray(array);
    }

    public static void main(String[] args) {
        processDescendingSortedArray();
    }
}
