package tb_constructor_bills_burgers;

public class MainBillsBurgers {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();
        System.out.println(hamburger.getTotalPrice());

        Hamburger secondHamburger = new Hamburger("lettuce", "tomato", "cheese", "onion");
        System.out.println(secondHamburger.getTotalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("cucumber");
        System.out.println(healthyBurger.getTotalPrice());

        HealthyBurger secondHealthyBurger = new HealthyBurger("pepper", "black seed");
        System.out.println("Basic healthy burger costs " + secondHamburger.getPrice());
        System.out.println("Price of 5th extra [" + secondHealthyBurger.getExtra5() + "] costs " + secondHealthyBurger.getExtra5Price() );
        System.out.println("Price of 6th extra [" + secondHealthyBurger.getExtra6() + "] costs " + secondHealthyBurger.getExtra6Price() );
        System.out.println("The " + secondHealthyBurger.getName() + " costs " + secondHealthyBurger.getTotalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("The " + deluxeBurger.getName() + " costs " + deluxeBurger.getTotalPrice() + " [" + deluxeBurger.getChips() + " and " + deluxeBurger.getDrinks() + " included]");
    }
}
