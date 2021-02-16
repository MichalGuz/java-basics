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

    private void moveMuscles() {}

    private void moveFin() {}

    private void swim(int speed) {
        moveMuscles();
        moveFin();
        super.move(speed);
    }
}