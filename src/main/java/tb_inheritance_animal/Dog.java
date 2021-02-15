package tb_inheritance_animal;

public class Dog extends Animal {
    private int tail;
    private int eyes;
    private String coat;

    public Dog(String name, int brain, int body, int tail, int eyes, String coat) {
        super(name, brain, body);
        this.tail = tail;
        this.eyes = eyes;
        this.coat = coat;
    }
}
