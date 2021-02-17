package tb_inheritance_volume_of_pool;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (width >= 0.0) {
            this.width = width;
        } else {
            this.width = 0.0;
        }
        if (length >= 0.0) {
            this.length = length;
        } else {
            this.length = 0.0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
