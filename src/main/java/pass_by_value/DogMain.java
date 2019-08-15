package pass_by_value;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Burek");
        System.out.println(dog.getName() + 1); // "Burek"
        dog.createNewDog(dog);
        System.out.println(dog.getName()+2); // "Burek"
    }
}
