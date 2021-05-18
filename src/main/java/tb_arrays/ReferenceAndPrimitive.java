package tb_arrays;

import tb_add_arrays_temp.Person;

public class ReferenceAndPrimitive {
    // variable primitive
    static void testAge() {
        int age = 18;
        System.out.println(age); // 18
        changeAge(age); // 21
        System.out.println(age); // 18
    }

    // variable primitive
    static void changeAge(int age) {
        age = 21;
        System.out.println(age); // 21
    }

    // variable reference #1 called 'person'
    static void transformName(Person person){
        person.name = "Adam";
    }

    public static void main(String[] args) {
        // variable primitive
        testAge();

        // variable reference #2 called 'person'
        Person person = new Person(null);
        System.out.println(person.name); // null
    }
}
