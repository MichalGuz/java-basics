package tb_arrays;

import java.util.Random;
import java.util.Scanner;

public class PrintArray {
    public static void fillIntArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to set the range of array:");
        int range = scanner.nextInt();
        int[] values = new int[range];
        Random random = new Random();
        int v = random.nextInt(25);
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(25);
        }
    }



}
