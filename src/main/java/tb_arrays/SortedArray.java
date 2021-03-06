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
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray;
        int temp = 0;
        for(int i=0; i<array.length; i++) {
            for (int k = 0; k < array.length; k++) {
                if (array[i] > array[k]) {
                    temp = array[i];
                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }
        sortedArray = array.clone();
        printIntegers(sortedArray);
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] array = getIntegers(5);
        printIntegers(array);
        sortIntegers(array);
    }
}
