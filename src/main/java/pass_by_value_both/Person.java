package pass_by_value_both;

public class Person {
    String name = "Adam";

    public Person(){}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
