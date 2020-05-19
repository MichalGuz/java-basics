package pass_by_value_primitive;

public class PassByValueNumber {
    int value;
    String name;

    public PassByValueNumber(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
