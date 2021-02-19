package tb_opp_tims_burgers;

public class TimHealthyBurger extends TimHamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public TimHealthyBurger() {
        super("healthy", "fish", 10.25, "brown rye");
    }
}
