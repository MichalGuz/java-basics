package tb_constructor_bills_burgers;

public class HealthyBurger extends Hamburger {
    private String extra5;
    private String extra6;

    public HealthyBurger(String name, String roll, String meat, double price, String extra1, String extra2, String extra3, String extra4, String extra5, String extra6) {
        super(name, roll, meat, price, extra1, extra2, extra3, extra4);
        this.extra5 = extra5;
        this.extra6 = extra6;
    }
}
