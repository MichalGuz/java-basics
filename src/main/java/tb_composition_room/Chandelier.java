package tb_composition_room;

public class Chandelier extends Lamp {
    public Chandelier(String name, String style, String color, int numberOfLights, String typeOfLights, double width, double high) {
        super(name, style, color, numberOfLights, typeOfLights, width, high);
    }

    @Override
    public void turnOnTheLamp() {
        super.turnOnTheLamp();
    }

    @Override
    public void turnOffTheLamp() {
        super.turnOffTheLamp();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getStyle() {
        return super.getStyle();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getNumberOfLights() {
        return super.getNumberOfLights();
    }

    @Override
    public String getTypeOfLights() {
        return super.getTypeOfLights();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHigh() {
        return super.getHigh();
    }
}
