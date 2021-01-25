package tb_composition_room;

public class TableLamp extends Lamp {
    public TableLamp(String style, String color, int numberOfLights, String typeOfLights, double width, double high) {
        super("table lamp", style, color, numberOfLights, typeOfLights, width, high);
    }

    @Override
    public void turnOnTheLamp() {
        System.out.println("press the button up on the table lamp");
        super.turnOnTheLamp();
    }

    @Override
    public void turnOffTheLamp() {
        System.out.println("press the button down on the table lamp");
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
