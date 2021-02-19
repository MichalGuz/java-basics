package tb_opp_tims_burgers;

public class TimHealthyBurger extends TimHamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public TimHealthyBurger() {
        super("healthy", "fish", 10.25, "brown rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyBurgerPrice = super.itemizeHamburger();
        if(healthyExtra1Name != null) {
            healthyBurgerPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if(healthyExtra2Name != null) {
            healthyBurgerPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        System.out.println("Total healthy burger price is " + healthyBurgerPrice);
        return healthyBurgerPrice;
    }
}
