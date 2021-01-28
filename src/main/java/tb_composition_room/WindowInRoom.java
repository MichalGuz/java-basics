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

    public void openWindowsInTheRoom(){
        if(getNumberOfWindows() <= 0) {
            System.out.println("There is no window in the room");
        } else if (getNumberOfWindows() == 1) {
            System.out.println("The window in the room was opened");
        } else if (getNumberOfWindows() > 1) {
            System.out.println("All windows in the room were opened");
        }
    }

    public void closeWindowsInTheRoom(){
        if(getNumberOfWindows() <= 0) {
            System.out.println("There is no window in the room");
        } else if (getNumberOfWindows() == 1) {
            System.out.println("The window in the room was closed");
        } else if (getNumberOfWindows() > 1) {
            System.out.println("All windows in the room were closed");
        }
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
