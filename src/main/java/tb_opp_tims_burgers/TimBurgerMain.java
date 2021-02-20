package tb_opp_tims_burgers;

public class TimBurgerMain {
    public static void main(String[] args) {
        TimHamburger hamburger = new TimHamburger();
        hamburger.addHamburgerAddition1("lettuce", 0.45);
        hamburger.addHamburgerAddition2("tomato",0.65);
        hamburger.addHamburgerAddition3("barbecue sauce", 0.30);
        hamburger.itemizeHamburger();

        TimDeluxeBurger deluxeBurger = new TimDeluxeBurger();
        deluxeBurger.itemizeHamburger();

        TimHealthyBurger healthyBurger = new TimHealthyBurger();
        healthyBurger.addHealthAddition1("lettuce", 0.45);
        healthyBurger.addHealthAddition2("tomato", 0.65);
        healthyBurger.addHamburgerAddition1("cucumber", 0.35);
        healthyBurger.addHamburgerAddition2("onion", 0.15);
        healthyBurger.addHamburgerAddition3("garlic spread", 0.25);
        healthyBurger.addHamburgerAddition4("olive", 0.75);
        healthyBurger.itemizeHamburger();
    }
}

