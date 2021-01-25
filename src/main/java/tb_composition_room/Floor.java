package tb_composition_room;

public class Floor {
    private double width;
    private double length;
    private String carpet;
    private Hoover hoover;

    public Floor(double width, double length, String carpet, Hoover hoover) {
        this.width = width;
        this.length = length;
        this.carpet = carpet;
        this.hoover = hoover;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public String getCarpet() {
        return carpet;
    }

    public Hoover getHoover() {
        return hoover;
    }

    private void cleanCarpet() {
        hoover.turnOnHoover();
        System.out.print("Carpet ");
        hoover.clean();
        hoover.turnOffHoover();
    }

    public void cleanFloor() {
        cleanCarpet();
        System.out.println("The floor was cleaned with " + hoover.getName() + ".");
    }
}
