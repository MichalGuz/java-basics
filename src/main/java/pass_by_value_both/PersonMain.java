package pass_by_value_both;

public class PersonMain {
    public static void main(String[] args) {
        Person adam = new Person();
        Person roman = new Person("Adam");

        System.out.println(adam.getName());
        System.out.println(roman.getName());

        }
}
