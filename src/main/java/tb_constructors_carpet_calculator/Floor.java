package tb_constructors_carpet_calculator;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
}
