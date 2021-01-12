package tb_arrays;

import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int number) {
        int unsortedArray[] = new int[number];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<number; i++) {
            System.out.println("Enter an integer:");
            int enteredNumber = scanner.nextInt();
            scanner.nextLine();
            unsortedArray[i] = enteredNumber;
        }
        return unsortedArray;
    }

    public static void printIntegers(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + "contents " + array[i]);
        }
    }
}
