package tb_constructor_bills_burgers;

public class Hamburger {
    private String name;
    private String roll;
    private String meat;
    private double price;
    private String extra1;
    private String extra2;
    private String extra3;
    private String extra4;

    public Hamburger(String name, String roll, String meat, double price, String extra1, String extra2, String extra3, String extra4) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
        this.extra4 = extra4;
    }

    public Hamburger(String extra1, String extra2, String extra3, String extra4) {
        this("hamburger", "white", "beef", 19.99, extra1, extra2, extra3, extra4);
    }

    public Hamburger(String extra1, String extra2, String extra3) {
        this("hamburger", "white", "beef", 19.49, extra1, extra2, extra3, "");
    }

    public Hamburger(String extra1, String extra2) {
        this("hamburger", "white", "beef", 18.49, extra1, extra2, "", "");
    }
}
