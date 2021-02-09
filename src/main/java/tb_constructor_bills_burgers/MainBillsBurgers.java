package tb_constructor_bills_burgers;

public class MainBillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();
        System.out.println(hamburger.getTotalPrice());

        Hamburger secondHamburger = new Hamburger("lettuce", "tomato", "cheese", "onion");
        System.out.println(secondHamburger.getTotalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("cucumber");
        System.out.println(healthyBurger.getTotalPrice());
    }
}
