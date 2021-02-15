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

    private void walk(int speed) {
        System.out.println("Dog class -> walk() called");
        move(speed);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog class -> moveLegs() called");
        if(speed > 0 && speed <= 5) {
            walk(speed);
        } else if (speed > 5){
            run(speed);
        } else {
            System.out.println("Dog moving legs but remains in one place");
        }
    }
}
