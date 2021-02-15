package tb_inheritance_animal;

public class Animal {
    private String name;
    private int brain;
    private int body;

    public Animal(String name, int brain, int body) {
        this.name = name;
        this.brain = brain;
        this.body = body;
    }

    public void eat() {
        System.out.println("Animal class -> eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal class -> move() called");
        System.out.println("Animal is moving at" + speed);
    }
}
