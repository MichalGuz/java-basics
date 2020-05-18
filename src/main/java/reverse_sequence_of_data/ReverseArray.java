package reverse_sequence_of_data;

public class ReverseArray {
    public static int[] reverseArray(int[] n) {
        for (int i = 0; i < n.length/2; i++ ) {
            int temp = n[i];
            // swap elements
            n[i] = n[n.length - 1 - i];
            n[n.length - 1 - i] = temp;
        }
    }
}
