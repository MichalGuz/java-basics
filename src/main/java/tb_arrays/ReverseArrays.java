package tb_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays {
    private static Scanner scanner = new Scanner(System.in);

    public static int enterNumberOfElements() {
        System.out.println("enter an integer:");
        int number = scanner.nextInt();
        return number;
    }

    public static int[] enterElementsOfArray(int number) {
        System.out.println("enter " + number + " of integers:");
        int[] array = new int[number];
        for (int i=0; i<number; i++){
            int temp = scanner.nextInt();
            array[i] = temp;
        }
        System.out.println("Array = " + Arrays.toString(array));
        return array;
    }
}
