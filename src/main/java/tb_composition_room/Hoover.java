package tb_composition_room;

public class Hoover {
    private String name;
    private int power;

    public Hoover(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void turnOnHoover() {
        System.out.println("Hoover was turned on");
    }

    public void turnOffHoover() {
        System.out.println("Hoover was turned off");
    }

    public void clean() {
        System.out.println(" was cleaned with hoover");
    }
}
