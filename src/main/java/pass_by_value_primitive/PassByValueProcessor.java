package pass_by_value_primitive;

public class PassByValueProcessor {
    public void printNumber(PassByValueNumber number) {
        number.setValue(number.getValue() + 1);
        System.out.println("Value after call the printNumber method = " + number.getValue());
    }

    public void printInt( int n) {
        n++;
        System.out.println("int after the call of printInt method = " + n);
    }

    public static void main(String[] args) {
        PassByValueNumber pbvn = new PassByValueNumber(5,"name");

        int i = 2;
        System.out.println("int before the call of printInt method = " + i);
        PassByValueProcessor processor = new PassByValueProcessor();
        processor.printInt(i);
    }
}
