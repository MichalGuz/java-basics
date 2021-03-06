package pass_by_value_object;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void createNewDog(Dog dog) {
        System.out.println("Poczatek createNewDog");
        System.out.println(dog.getName()); // "print Burek - name from main method"
        dog = new Dog("Rex");
        System.out.println(dog.getName()); // "print Rex"
        System.out.println("Koniec createNewDog");
    }
}