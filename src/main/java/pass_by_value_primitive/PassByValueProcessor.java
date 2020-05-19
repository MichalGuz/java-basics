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
        temp = number.getValue();
        System.out.println("[3 step of method numberObjectUtilization ] temp = " + temp);
        return temp;
    }

    public int numberObjectUtilization(PassByValueNumber number, int i) {
        System.out.println("[1 step of method numberObjectUtilization ] int at beginning of numberObjectModifier method " + number.getValue());
        int tempUtil = number.getValue() * i;
        String nameUtil = "Brand new name";
        number = new PassByValueNumber(tempUtil, nameUtil);
        System.out.println("[2 step of method numberObjectUtilization ] int during of numberObjectModifier method " + number.getValue());
        tempUtil = number.getValue();
        System.out.println("[3 step of method numberObjectUtilization ] tempUtil = " + tempUtil);
        return tempUtil;

    }

    public static void main(String[] args) {
        PassByValueNumber pbvn = new PassByValueNumber(2,"name");
        int val = pbvn.getValue();

        int i = 2;
        System.out.println("int before the call of printInt method = " + i);
        PassByValueProcessor processor = new PassByValueProcessor();

        processor.printInt(i);
        System.out.println("int after the call of printInt method = " + i  + "\n");

        processor.numberObjectUtilization(pbvn, 4);
        System.out.println("after numberObjectUtilization value = " + pbvn.getValue() + " and name = " + pbvn.getName() + "\n" );

        processor.numberObjectModifier(pbvn,4);
        System.out.println("after numberObjectmidifier value = " + pbvn.getValue() + " and name = " + pbvn.getName()  + "\n");

        System.out.println("int before the call of printNumber method = " + val + " - int retrieved from object pbvn BEFORE operation with this object");
        System.out.println("int before the call of printNumber method = " + pbvn.getValue() + " - int retrieved from object pbvn AFTER operation with this object");
        processor.printNumber(pbvn);

        int valAfter = pbvn.getValue();
        System.out.println("int after the call of printNumber method = " + valAfter + "\n");

        processor.printInt(val); // raw val retrieved from object pbvn

        int check = pbvn.getValue();
        System.out.println("\nint check = " + check + "\n");

        processor.printInt(check);

        processor.numberObjectModifier(pbvn,4);
    }
}
