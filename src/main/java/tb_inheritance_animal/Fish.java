package tb_inheritance_animal;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int gills, int eyes, int fins) {
        super(name, brain, body);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
}
