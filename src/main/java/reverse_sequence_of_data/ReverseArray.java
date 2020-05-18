package reverse_sequence_of_data;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] n) {
        for (int i = 0; i < n.length/2; i++ ) {
            int temp = n[i];
            // swap elements
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = temp;
        }

        return n;
    }

    public static void main(String[] args) {
        int[] exmpl = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        System.out.println(Arrays.toString(exmpl));

        reverseArray(exmpl);

        System.out.println(Arrays.toString(exmpl));
    }
}
