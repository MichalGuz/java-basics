package pass_by_value_primitive;

public class PassByValueProcessor {
    public static void printNumber(PassByValueNumber number) {
        number.setValue(number.getValue() + 1);
        System.out.println("Value after call the printNumber method = " + number.getValue());
    }
}
