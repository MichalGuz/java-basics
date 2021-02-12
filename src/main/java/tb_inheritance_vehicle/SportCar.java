package tb_inheritance_vehicle;

public class SportCar extends Car {
    private int roadServiceMonth;

    public SportCar(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadServiceMonth) {
        super(name, size, wheels, doors, gears, isManual);
        this.roadServiceMonth = roadServiceMonth;
    }
}
