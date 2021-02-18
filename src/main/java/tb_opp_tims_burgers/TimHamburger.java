package tb_opp_tims_burgers;

public class TimHamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    public TimHamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public TimHamburger() {
        this("standard", "beef", 8.75, "white");
    }
}
