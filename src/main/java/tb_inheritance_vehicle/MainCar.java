package tb_inheritance_vehicle;

public class MainCar {
    public static void main(String[] args) {
        Bugatti bugatti = new Bugatti("roadster");
        bugatti.accelerate(10);
        bugatti.accelerate(10);
        bugatti.accelerate(90);
        bugatti.accelerate(100);
        bugatti.accelerate(-140);
        bugatti.accelerate(-70);
        bugatti.accelerate(10);
        bugatti.accelerate(-10);
    }
}

