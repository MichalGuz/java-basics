package tb_constructor_bills_burgers;

public class HealthyBurger extends Hamburger {
    private String extra5;
    private String extra6;

    public HealthyBurger(String name, String roll, String meat, double price, String extra1, String extra2, String extra3, String extra4, String extra5, String extra6) {
        super(name, roll, meat, price, extra1, extra2, extra3, extra4);
        this.extra5 = extra5;
        this.extra6 = extra6;
    }

    public HealthyBurger(String extra5, String extra6) {
        this("healthy burger", "brown rye", "lentil burger", 20.00, "lettuce", "tomato", "mustard", "onion", extra5, extra6);
    }

    public HealthyBurger(String extra5) {
        this("healthy burger", "brown rye", "lentil burger", 19.00, "lettuce", "tomato", "mustard", "onion", extra5, "");
    }

    public String getExtra5() {
        return extra5;
    }

    public String getExtra6() {
        return extra6;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    public double getExtra5Price() {
        return 3.0;
    }

    public double getExtra6Price() {
        return 0.9;
    }
}
