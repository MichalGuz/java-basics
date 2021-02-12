package tb_inheritance_vehicle;

public class SportCar extends Car {
    private int roadServiceMonth;

    public SportCar(String name, String size, int doors, int gears, boolean isManual, int roadServiceMonth) {
        super(name, size, 4, doors, gears, isManual);
        this.roadServiceMonth = roadServiceMonth;
    }
}
