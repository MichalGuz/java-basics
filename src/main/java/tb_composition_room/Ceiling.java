package tb_composition_room;

public class Ceiling {
    private double width;
    private double length;
    private String color;
    private Chandelier chandelier;

    public Ceiling(double width, double length, String color, Chandelier chandelier) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.chandelier = chandelier;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }
}
