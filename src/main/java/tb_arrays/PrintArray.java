package tb_arrays;

import java.util.Random;
import java.util.Scanner;

public class PrintArray {
    public static int[] fillIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to set the range of array:");
        int range = scanner.nextInt();
        int[] values = new int[range];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(25);
        }
    }

    public static void printIntArray(int[] array) {
        int counter = 0;
        for (int v : array) {
            counter++;
            System.out.println("the " + counter + " element of an array is: " + v);
        }
    }

    public static void process() {

    }
}
