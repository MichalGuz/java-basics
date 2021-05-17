package tb_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    static Scanner scanner = new Scanner(System.in);

    private static int readInteger(){
        System.out.println("Enter an integer:");
        int elements = scanner.nextInt();
        return elements;
    }

    private static int[] readElements(int elements) {
        System.out.println("Enter "+ elements + " of integers:");
        int[] array = new int[elements];
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(array));
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<array.length; i++) {
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        System.out.println("Min is "+ min);
        return min;
    }

    private static int findMinMy(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for(int k=0; k<array.length; k++){
                if(array[i] > array[k]){
                    int temp = array[k];
                    array[k] = array[i];
                    array[i] = temp;
                }
            }
            min = array[i];
        }
        System.out.println("int min (finMin) = " + min);
        return min;
    }

    public static void main(String[] args) {
        int r = readInteger();
        int[] arr = readElements(r);
        findMin(arr);
    }
}
