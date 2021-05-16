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

        anotherArray[0] = 1;

        System.out.println("myArray after change = " + Arrays.toString(myArray)); // {1,0,0}
        System.out.println("anotherArray after change = " + Arrays.toString(anotherArray)); // {1,0,0}

        modifyArray(myArray);

        System.out.println("myArray after modification = " + Arrays.toString(myArray)); // {2,0,0}
        System.out.println("anotherArray after modification = " + Arrays.toString(anotherArray)); // {2,0,0}

        anotherArray = new int[] {4,5,6,7};

        System.out.println("anotherArray after dereferencing = " + Arrays.toString(anotherArray)); // {4,5,6,7}
        modifyArray(anotherArray);
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
    }

}
