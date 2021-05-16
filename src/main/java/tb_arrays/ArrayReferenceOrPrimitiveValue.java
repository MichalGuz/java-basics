package tb_arrays;

import java.util.Arrays;

public class ArrayReferenceOrPrimitiveValue {
    public static void main(String[] args) {
        // primitive variables "holds" its values
        int value = 10;
        int anotherValue = value;

        System.out.println("value = " + value); // 10
        System.out.println("anotherValue = " + anotherValue); // 10

        anotherValue++;

        System.out.println("value = " + value); // 10
        System.out.println("anotherValue = " + anotherValue); // 11

        // reference variables "holds" only an address to the object (not the object directly)
        int[] myArray = new int[3];
        int[] anotherArray = myArray;

        System.out.println("myArray = " + Arrays.toString(myArray)); // {0,0,0}
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // {0,0,0}
    }
}
