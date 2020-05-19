package array_comparison;

import java.util.Arrays;

public class CompareArrays {
    public static void compareArraysInt(int[] a, int[] b) {
        Object[] arr1 = {a};
        Object[] arr2 = {b};
        Object[] inArr1 = {arr1};
        Object[] inArr2 = {arr2};
        if(Arrays.deepEquals(inArr1, inArr2)) {
            System.out.println("arrays are equal.");
        } else {
            System.out.println("arrays are different");
        }

    }
}
