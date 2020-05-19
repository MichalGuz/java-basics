package array_comparison;

import java.util.Arrays;

public class CompareArrays {
    public static void compareArraysInt(int[] a, int[] b) {
        Object[] arr1 = {a};
        Object[] arr2 = {b};
        Object[] inArr1 = {arr1};
        Object[] inArr2 = {arr2};
        if(Arrays.deepEquals(inArr1, inArr2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are different.");
        }
    }

    public static void main(String[] args) {
        int[] example1 = {1,2,3,4,5};
        int[] example2 = {1,2,3,4,5};
        int[] example3 = {1,2,3,5,4};
        int[] example4 = {1,2,3,4,5,6};

        compareArraysInt(example1, example2);
        compareArraysInt(example1, example3);
        compareArraysInt(example3, example4);
    }
}
