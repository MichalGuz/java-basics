package tb_arrays;

public class ArrayReferenceOrPrimitiveValue {
    public static void main(String[] args) {
        // primitive variables "holds" its values
        int value = 10;
        int anotherValue = value;

        System.out.println("value = " + value); // 10
        System.out.println("anotherValue = " + anotherValue); // 10

        anotherValue++;

    }
}
