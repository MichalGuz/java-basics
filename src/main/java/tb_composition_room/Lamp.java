package tb_composition_room;

public class Lamp {
    private String name;
    private String style;
    private String color;
    private int numberOfLights;
    private String typeOfLights;
    private double width;
    private double high;

    public Lamp(String name, String style, String color, int numberOfLights, String typeOfLights, double width, double high) {
        this.name = name;
        this.style = style;
        this.color = color;
        this.numberOfLights = numberOfLights;
        this.typeOfLights = typeOfLights;
        this.width = width;
        this.high = high;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public String getTypeOfLights() {
        return typeOfLights;
    }

    public double getWidth() {
        return width;
    }

    public double getHigh() {
        return high;
    }
}
