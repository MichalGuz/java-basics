package tb_inheritance_animal;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int gills, int eyes, int fins) {
        super(name, 1, 1);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish is resting");
    }

    private void moveMuscles() {
        System.out.println("Fish class -> moveMuscles() called");
    }

    private void moveFin() {
        System.out.println("Fish class -> moveFin() called");
    }

    public void swim(int speed) {
        moveMuscles();
        moveFin();
        move(speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Fish class -> move() called");
    }
}
