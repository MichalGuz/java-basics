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

    private void rest() {}

    private void moveMuscles() {}

    private void moveFin() {}

}
