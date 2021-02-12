package tb_inheritance_vehicle;

public class Bugatti extends SportCar {
    private String type;

    public Bugatti(String name, String size, int doors, int gears, boolean isManual, int roadServiceMonth, String type) {
        super(name, size, doors, gears, isManual, roadServiceMonth);
        this.type = type;
    }
}
