package tb_inheritance_vehicle;

public class Bugatti extends SportCar {
    private String type;

    public Bugatti(String type) {
        super("Veyron", "W16", 3, 7, false, 36);
        this.type = type;
    }

    @Override
    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity <= 0) {
            stop();
        } else if (newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 50) {
            changeGear(4);
        } else if (newVelocity > 50 && newVelocity <= 70) {
            changeGear(5);
        } else if (newVelocity > 70 && newVelocity <= 100) {
            changeGear(6);
        } else if (newVelocity > 100){
            changeGear(7);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
