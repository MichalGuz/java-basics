package tb_inheritance_vehicle;

public class Bugatti extends SportCar {
    private String type;

    public Bugatti(String type) {
        super("Veyron", "W16", 3, 7, false, 36);
        this.type = type;
    }
}
