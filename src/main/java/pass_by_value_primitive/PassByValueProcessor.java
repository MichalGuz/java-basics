package pass_by_value_primitive;

public class PassByValueProcessor {
    public void printNumber(PassByValueNumber number) {
        number.setValue(number.getValue() + 1);
        System.out.println("[method printNumber] int processed by call of printNumber method = " + number.getValue());
    }

    public void printInt( int n) {
        n++;
        System.out.println("[method printInt] int processed the call of printInt method = " + n);
    }

    public int numberObjectModifier(PassByValueNumber number, int i) {
        System.out.println("[1 step of method numberObjectModifier] int at beginning of numberObjectModifier method " + number.getValue());
        int temp = number.getValue() * i;
        number.setValue(temp);
        System.out.println("[2 step of method numberObjectModifier] int during of numberObjectModifier method " + number.getValue());
        return number.getValue();
    }

    public static void main(String[] args) {
        PassByValueNumber pbvn = new PassByValueNumber(5,"name");
        int val = pbvn.getValue();

        int i = 2;
        System.out.println("int before the call of printInt method = " + i);
        PassByValueProcessor processor = new PassByValueProcessor();

        processor.printInt(i);
        System.out.println("int after the call of printInt method = " + i);

        processor.numberObjectModifier(pbvn,4);

        System.out.println("int before the call of printNumber method = " + val);
        processor.printNumber(pbvn);

        int valAfter = pbvn.getValue();
        System.out.println("int after the call of printNumber method = " + valAfter);

        processor.printInt(val); // raw val retrieved from object pbvn
        int check = pbvn.getValue();

        System.out.println("int check = " + check);

        processor.printInt(check);

        processor.numberObjectModifier(pbvn,4);
    }
}
