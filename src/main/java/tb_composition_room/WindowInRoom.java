package tb_composition_room;

public class WindowInRoom {
    private int numberOfWindows;
    private double width;
    private double heigth;

    public WindowInRoom(int numberOfWindows, double width, double heigth) {
        this.numberOfWindows = numberOfWindows;
        this.width = width;
        this.heigth = heigth;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }
}
