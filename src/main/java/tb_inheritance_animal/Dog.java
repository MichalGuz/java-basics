package tb_inheritance_animal;

public class Dog extends Animal {
    private int tail;
    private int eyes;
    private String coat;

    public Dog(String name, int tail, int eyes, String coat) {
        super(name, 1, 1);
        this.tail = tail;
        this.eyes = eyes;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog is chewing the food.");
    }

    @Override
    public void eat() {
        System.out.println("Dog class -> eat() called");
        chew();
        super.eat();
    }

    private void run(int speed) {
        System.out.println("Dog class -> run() called");
        move(speed);
    }
}
